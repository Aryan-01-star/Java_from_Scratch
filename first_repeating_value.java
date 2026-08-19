import java.util.*;
public class first_repeating_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("The first repeating value is: "+arr[i]);
                    return;
                }
            }
        }
        System.out.println("No repeating value found.");
    }
}