import java.util.*;
public class prefix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pref = new int[arr.length];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        System.out.print("Prefix sum array: ");
        for (int i = 0; i < pref.length; i++) {
            System.out.print(pref[i] + " ");
        }
    }
}
