package interfaceAssignment;
import java.util.*;
public class Tester {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        MyCalculator cal = new MyCalculator();
        System.out.println("Enter an integer : ");
        int x = sc.nextInt();
        int res = cal.divisor_sum(x);
        System.out.println("The sum of all divisors of "+ x+ " is "+ res);
    }
}
