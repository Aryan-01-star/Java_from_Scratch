import java.util.*;
public class last_occurance_of_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int lastIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                lastIndex = i;
            }
        }
        if(lastIndex == -1){
            System.out.println("Target element not present in array");
        }
        else{
            System.out.println("Last Index for your target is at: "+ lastIndex);
        }
    }    
}
