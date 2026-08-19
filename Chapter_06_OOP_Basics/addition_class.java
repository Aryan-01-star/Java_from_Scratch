import java.util.*;
class Algebra{
    double add(double x, double y){
        double result = x+y;
        return result;
    }    
}
public class addition_class {
    public static void main(String[] args) {
        Algebra alg = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers for addition: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double ans = alg.add(a,b);
        System.out.print("The sum is: " + ans);
    }    
}
