public class ExceptionHandling {

    public static void main(String[] args) {
        int a,b,c;
        try{
            a=10;
            b=0;
            c = a/b;
            System.out.println("The value of c is "+c);
        }
        catch(ArithmeticException e)
        {
             System.out.println("Divide by zero");
        }
        finally{
            System.out.println("This block executes regardless if an exception was thrown or not");
        }
    }
}