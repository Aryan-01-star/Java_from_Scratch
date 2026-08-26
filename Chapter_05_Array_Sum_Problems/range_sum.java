import java.util.*;
public class range_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the start and end indices of the range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        if(start < 0 || end >= n || start > end) {
            System.out.println("Invalid range");
            return;
        }
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements in the given range: " + sum);
    }
}
