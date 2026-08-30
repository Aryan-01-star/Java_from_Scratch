import java.util.*;
public class arrayPartitioning {
    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // boolean exists = equalSumPartition(arr);
        System.out.println("Equal sum partition exists: " + equalSumPartition(arr));
    }
}