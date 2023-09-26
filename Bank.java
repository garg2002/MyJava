import java.util.Scanner;


class Account {
    double ta,wi,de ;

    void show()
    {
        System.out.println("Total Amount:-"+ta);

    }
}

class Deposit_Withdraw extends Account
{
    Scanner sc = new Scanner(System.in);
    void deposit()
    {
        System.out.println("Enter Deposit Amount:-");
        de = sc.nextDouble();
        sc.close();

        ta = ta+de;
        show();
    }
         void withdraw()
    {
        System.out.println("Enter Withdraw Amount:-");
        wi = sc.nextDouble();
        sc.close();

        if(wi>ta)
        {
            System.out.println("Insufficient Balance:-");
        }
        else{
            ta = ta-wi;
            show();
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        Deposit_Withdraw obj1 = new Deposit_Withdraw();
        
        obj1.deposit();
        obj1.withdraw();
    }
}



