import java.util.*;
public class search_for_target{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                System.out.println("Target element found at index: " + i);
                return;
            }
        }
        System.out.println("Target element not found in the array.");
    }
}