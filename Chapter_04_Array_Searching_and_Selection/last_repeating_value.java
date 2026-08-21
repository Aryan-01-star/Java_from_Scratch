import java.util.*;
public class last_repeating_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    c = arr[i];
                    continue;
                }
            }
        }
        if(c != -1){
            System.out.println("The last repeating value is: "+c);
        }
        else{
            System.out.println("No repeating value found.");
        }
    }
}
