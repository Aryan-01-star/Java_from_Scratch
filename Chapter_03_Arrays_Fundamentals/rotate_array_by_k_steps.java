import java.util.*;
public class rotate_array_by_k_steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of steps to rotate: ");
        int k = sc.nextInt();
        k = k % n; // to handle cases where k is greater than n
        reverse(arr, 0, n - 1); // reverse the entire array
        reverse(arr, 0, k - 1); // reverse the first k elements
        reverse(arr, k, n - 1); // reverse the remaining n-k elements
        System.out.println("Array after rotating is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
