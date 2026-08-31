import java.util.*;
public class matrix_addition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for row and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter the element for 1st matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("row: "+i+" and column: "+j+" --> ");
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[r][c];
        System.out.println("Enter the element for 2nd matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("row: "+i+" and column: "+j+" --> ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("For addition of two matrix the number of rows and columns should be same for both the matrix");
        int[][] c1 = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                c1[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(c1[i][j] + " ");
            }
            System.out.println();
        }
    }
}