import java.util.Scanner;

public class Factorial
{
    int Fact(int num)
    {
        return num==0 ? 1 : num*Fact(num-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:-");
        int num = sc.nextInt();
        Factorial obj = new Factorial();

        int fact = obj.Fact(num);

        sc.close();
        
        System.out.println("Factorial of a number is :- "+fact);
        
    }
}