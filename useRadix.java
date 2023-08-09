import java.util.Scanner;

public class useRadix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // useRadix(int radix) sets the scanner's number system to the specified radix.
        

        // 2: binary
        sc.useRadix(2);
        int a = sc.nextInt();
        System.out.println("a = " + a);

        // 8: octal
        sc.useRadix(8);
        int b = sc.nextInt();
        System.out.println("b = " + b);

        // 10: decimal
        sc.useRadix(10);
        int c = sc.nextInt();
        System.out.println("c = " + c); 

        // 16: hexadecimal
        sc.useRadix(16);
        int d = sc.nextInt();
        System.out.println("d = " + d); 

        sc.close();


    }
}
