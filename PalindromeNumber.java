import java.util.Scanner;

public class PalindromeNumber {

    public static int Palindrome(int num)
    {
        int sum =0;
        int temp =num;
        while(num>0)
        {
            int rem =  num%10;
            sum = sum*10 + rem;
            num = num/10;

        }
        int ans = (temp == sum) ? 1 : 0;
        return ans ;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        sc.close();
        int result = Palindrome(num);
        if( result ==1 ) 
        {
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
        
    }
}