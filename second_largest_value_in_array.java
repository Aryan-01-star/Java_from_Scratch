import java.util.*;
public class second_largest_value_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max_value = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max_value){
                max_value = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max_value){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        max_value = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max_value){
                max_value = arr[i];
            }
        }
        int second_max = max_value;
        System.out.println("The second largest value is: "+second_max);
    }
}