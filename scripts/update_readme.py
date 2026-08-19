from pathlib import Path
import re
from urllib.parse import quote

# =========================================================

# Configuration

# =========================================================

# Project root:

# Java_from_Scratch/

# ├── README.md

# └── scripts/

# └── update_readme.py

ROOT = Path(__file__).resolve().parent.parent

README = ROOT / "README.md"

START_MARKER = "<!-- AUTO-INDEX:START -->"
END_MARKER = "<!-- AUTO-INDEX:END -->"

# Folders that should NOT be treated as chapters

IGNORED_DIRECTORIES = {
".git",
".github",
".idea",
".vscode",
"scripts",
"node_modules",
"target",
"build",
"out",
}

# Only Java files will be counted

CODE_EXTENSION = ".java"

# =========================================================

# Count Java files

# =========================================================

def count_java_files(folder: Path) -> int:
    """Count all .java files inside a chapter folder.

    Subfolders are also included.
    Ignored directories are skipped.
    """

    count = 0

    for file in folder.rglob("*"):

        # Ignore directories
        if not file.is_file():
            continue

        # Get path relative to project root
        relative_parts = file.relative_to(ROOT).parts

        # Skip files located inside ignored directories
        if any(part in IGNORED_DIRECTORIES for part in relative_parts):
            continue

        # Count Java files only
        if file.suffix.lower() == CODE_EXTENSION:
            count += 1

    return count

# =========================================================

# Find chapter folders

# =========================================================

def find_chapters():
    """Find all eligible top-level folders.

    Every top-level folder is considered a chapter unless
    it is listed in IGNORED_DIRECTORIES.
    """

    chapters = []

    for item in ROOT.iterdir():

        # Only directories
        if not item.is_dir():
            continue

        # Ignore configured directories
        if item.name in IGNORED_DIRECTORIES:
            continue

        # Ignore hidden directories
        if item.name.startswith("."):
            continue

        chapters.append(item)

    # Sort chapters alphabetically
    return sorted(
        chapters,
        key=lambda path: path.name.lower()
    )
# =========================================================

# Escape Markdown table content

# =========================================================

def escape_markdown(text: str) -> str:
    """Escape characters that could break a Markdown table."""
    return text.replace("|", "\\|")

# =========================================================

# Generate README Index

# =========================================================

def generate_index() -> str:
    """Generate the Markdown table for the README."""

    chapters = find_chapters()

    lines = [
        "| Chapter | Code Count | Link |",
        "|---|---:|---|",
    ]

    # No chapters found
    if not chapters:
        lines.append(
            "| _No chapters found_ | 0 | - |"
        )

        return "\n".join(lines)

    # Generate one row per chapter
    for chapter in chapters:

        chapter_name = escape_markdown(
            chapter.name
        )

        code_count = count_java_files(chapter)

        # Convert Windows path to URL-style path
        relative_path = chapter.relative_to(
            ROOT
        ).as_posix()

        # Safely encode spaces and special characters
        encoded_path = "/".join(
            quote(part, safe="")
            for part in relative_path.split("/")
        )

        lines.append(
            f"| {chapter_name} | "
            f"{code_count} | "
            f"[Open](./{encoded_path}) |"
        )

    return "\n".join(lines)

# =========================================================

# Update README

# =========================================================

def update_readme():
    """Replace only the automatically generated section
    between AUTO-INDEX markers.

    Everything else in README.md remains untouched.
    """

    # Check README exists
    if not README.exists():
        raise FileNotFoundError(
            f"README.md was not found at: {README}"
        )

    # Read README
    content = README.read_text(
        encoding="utf-8"
    )

    # Check start marker
    if START_MARKER not in content:
        raise ValueError(
            f"Missing start marker:\n{START_MARKER}"
        )

    # Check end marker
    if END_MARKER not in content:
        raise ValueError(
            f"Missing end marker:\n{END_MARKER}"
        )

    # Create regular expression that matches everything between the two markers
    pattern = re.compile(
        re.escape(START_MARKER)
        + r".*?"
        + re.escape(END_MARKER),
        re.DOTALL,
    )

    index = generate_index()
    replacement = (
        f"{START_MARKER}\n\n"
        f"{index}\n\n"
        f"{END_MARKER}"
    )

    updated_content = pattern.sub(
        replacement,
        content,
        count=1,
    )

    if updated_content != content:
        README.write_text(
            updated_content,
            encoding="utf-8",
        )
        print("README index updated successfully.")
    else:
        print("README index is already up to date.")
# =========================================================

# Main

# =========================================================

if __name__ == "__main__":
    update_readme()
