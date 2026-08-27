


// Brute force approach to calculate the sum of elements in the given range


import java.util.*;
public class prefix_sum_in_range_no_extra_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the start and end indices of the range from 1-" + n + ": ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        if (start < 1 || end > n || start > end) {
            System.out.println("Invalid range. Please enter valid start and end indices.");
            return;
        }
        for (int i = start-1; i <= end-1; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements in the given range: " + sum);
    }
}
