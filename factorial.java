import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number for factorial:");
        int n = sc.nextInt();
        int factorial=1;
        if(n==0 || n==1){
            factorial = 1;
        }
        else{
            while (n>0) {
                factorial*=n;
                n--;
            }
        }
        System.out.println("Factorial for "+n+ "is: "+ factorial);
    }
}