import java.util.Scanner;

public class reverse_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value for row: ");
        int r = sc.nextInt();
        for(int i=r;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
