import java.util.*;

public class sort_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();

        System.out.println("Enter the value of array: ");
        int[] arr = new int[l];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int st = 0;
        int ed = arr.length - 1;
        int[] ans = new int[arr.length];
        int k = 0;

        while (st <= ed) {
            if (Math.abs(arr[st]) > Math.abs(arr[ed])) {
                ans[k++] = arr[st] * arr[st];
                st++;
            } else {
                ans[k++] = arr[ed] * arr[ed];
                ed--;
            }
        }

        int i = 0;
        int j = ans.length - 1;

        while (i < j) {
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;

            i++;
            j--;
        }

        // Print in increasing order
        for (int x = 0; x < ans.length; x++) {
            System.out.print(ans[x] + " ");
        }

        sc.close();
    }
}
