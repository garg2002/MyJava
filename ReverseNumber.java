import java.util.*;
public class ReverseNumber {
    public static int Reverse(int num)
    {
        int sum =0;
        boolean bool = false;
        if(num<0)
        {
            bool = true;
            num = -1*num;
        }
        if(num==0)
        {
            return 0;
        }

        while(num>0)
        {
            int rem =  num%10;
            sum = sum*10 + rem;
            num = num/10;

        }
        return bool == true ? -1*sum : sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        sc.close();
        int result = Reverse(num);
        System.out.println("Reverse number of "+num+" is "+result);
    }
}
