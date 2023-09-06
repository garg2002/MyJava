public class Classes {
    //Data Members || Variables
    int x =10;   
     
     // Members Functions || Methods
    public static void main(String[] args) {
        int x =20;
        System.out.println("Value of x inside main method:-"+x);

        //Object creation 
        Classes obj = new Classes();

        //Variable calling using object
        int n = obj.x;
        System.out.println("Value of x outside main method:-"+n);
    }
}
