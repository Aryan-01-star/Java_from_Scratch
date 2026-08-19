import java.util.Scanner;

public class triangular_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
