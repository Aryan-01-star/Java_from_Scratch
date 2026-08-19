import java.util.Scanner;

public class sum_of_all_elements_of_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the values: ");
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("The sum of all the elements are: "+ sum);
    }
}
