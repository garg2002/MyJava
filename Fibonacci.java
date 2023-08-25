import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("The Fibonacci Series is: ");
        for(int i = 0; i < n; i++) {
            
            System.out.println(fib[i]);
        }
    }

}
