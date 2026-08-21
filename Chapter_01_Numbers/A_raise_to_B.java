import java.util.*;
public class A_raise_to_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 1;
        if(a == 0){
            System.out.println("Invalid value for 'a'!!, Value for 'a' can't be 0");
        }
        for(int i=1;i<=b;i++){
            res*=a;
        }
        System.out.println("The result for " + a +" raised to "+ b + " is: "+ res);
    }
}