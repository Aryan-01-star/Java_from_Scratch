import java.util.*;
public class reverse_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int n = sc.nextInt();
        int rev_num = 0;
        while(n>0){
            rev_num = rev_num * 10 + n % 10;
            n /= 10; 
        }
        System.out.println("Reverse for the input is: "+ rev_num);
    }
}