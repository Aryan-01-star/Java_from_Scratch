
import java.util.*;
public class check_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                flag = 1;
            }
            else{
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }    
}
