import java.util.*;
public class PrefixSumOptimal {
    static int[] prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefix = prefixSum(arr);
        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        while(q-- > 0) {
            System.out.print("Enter the start and end indices of the range: ");
            int st = sc.nextInt();
            int ed = sc.nextInt();
            if (st < 1 || ed > n || st > ed) {
                System.out.println("Invalid range. Please enter valid indices.");
                continue;
            }
            int sum = prefix[ed] - prefix[st - 1];
            System.out.println("Sum of elements from index " + st + " to " + ed + " is: " + sum);
        }
    }
}