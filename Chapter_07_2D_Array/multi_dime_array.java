import java.util.*;
public class multi_dime_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the 2D array:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println("Enter the elements of the 2D array:");
        int[][] arr = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}