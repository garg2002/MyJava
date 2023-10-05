import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :");
        int n = sc.nextInt();
         System.out.println("Enter the number of elements in array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int even =0, odd =0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even = even+1;
            }
            else
            {
                odd = odd+1;
            }
        }

         System.out.println("Total even numbers are: "+even);
         System.out.println("Total odd numbers are: "+odd);
         sc.close();
    }
}
