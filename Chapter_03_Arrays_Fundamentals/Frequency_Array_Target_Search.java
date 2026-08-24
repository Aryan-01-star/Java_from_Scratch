import java.util.*;
public class Frequency_Array_Target_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] freq = new int[100005];
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the target element to search: ");
            int targetElement = sc.nextInt();
            if(freq[targetElement] > 0){
                System.out.println("Target element found in the array.");
            } else {
                System.out.println("Target element not found in the array.");
            }
        }
    }
}