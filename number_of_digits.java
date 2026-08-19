import java.util.*;
public class number_of_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number_of_digits = 0;
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        while(n>0){
            n/=10;
            number_of_digits++;
        }
        System.out.println("Number of digits are: "+ number_of_digits);
    }
}