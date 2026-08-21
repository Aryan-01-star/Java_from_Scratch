import java.util.*;
public class swaping_var_using_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st and 2nd values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Values before swapping is 1st value:"+ a+ " and, 2nd value is: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swapping is 1st value:"+ a+ " and, 2nd value is: "+b);
    }
}
