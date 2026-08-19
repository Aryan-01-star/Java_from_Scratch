import java.util.*;
public class sum_of_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("The sum of the digits are: "+ sum);
    }
}