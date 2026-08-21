import java.util.Scanner;
public class reversing_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < n/2; i++) { // i<n/2 because we are swapping the first half with the second half, the array is already reversed and if we take i<n then swapping, it will return to the original array
            int temp = arr[i];
            arr[i] = arr[n - i - 1]; // if n =5 i =0 then arr[0] = arr[5-0-1] = arr[4]
            arr[n - i - 1] = temp; // if n =5 i =0 then arr[4] = temp = arr[0]
        }
        System.out.println("\nArray after reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
