import java.util.*;
public class kth_largest_and_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();        
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int smallest_Value = Integer.MAX_VALUE;
        int largest_Value = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest_Value){
                smallest_Value = arr[i];
            }
            if(arr[i]>largest_Value){
                largest_Value = arr[i];
            }
        }
        System.out.println("Largest Number is: "+ largest_Value+ " and Smallest Number is: "+ smallest_Value);
    }
}
