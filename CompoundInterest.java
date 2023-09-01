import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter Principal, Rate, And Time values");
        double principal = sc.nextDouble();
        double rate  = sc.nextDouble();
        double time  = sc.nextDouble();

        sc.close();
  
        /* Calculate compound interest */
        double CI = principal * (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
    }
}