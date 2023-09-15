import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        sc.close();
        int flag =0;


        for(int i = 2;i<=prime/2;i++)
        {
            if(prime%i == 0)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println("Prime Number");

        }
        else{
            System.out.println("Not Prime Number");
        }

    }
}