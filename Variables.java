/*
Variables are used to store data in a program. When you create a variable, you reserve some space in memory.
The data type of a variable determines the amount of space it occupies in the memory and the type of data that can be stored in the variable.
Java is a statically typed language, which means that you must declare all variables before they can be used.
*/

public class Variables {
    public static void main(String[] args) {
       int a = 10;  //declare and initialize a variable of type int.
       System.out.println("a = " + a); //print the value of a.

        a = 20; //assign a new value to a.
        System.out.println("a = " + a); //print the new value of a.

        byte b = 127; //declare and initialize a variable of type byte.
        System.out.println("b = " + b); //print the value of b.

        short c = 32767; //declare and initialize a variable of type short.
        System.out.println("c = " + c); //print the value of c.

        long d = 9223372036854775807L; //declare and initialize a variable of type long.
        System.out.println("d = " + d); //print the value of d.

        float e = 3.4028235E38f; //declare and initialize a variable of type float.
        System.out.println("e = " + e); //print the value of e.

        double f = 1.7976931348623157E308; //declare and initialize a variable of type double.
        System.out.println("f = " + f); //print the value of f.

        char g = 'A'; //declare and initialize a variable of type char.
        System.out.println("g = " + g); //print the value of g.

        boolean h = true; //declare and initialize a variable of type boolean.
        System.out.println("h = " + h); //print the value of h.

        String i = "Namaste Duniya!"; //declare and initialize a variable of type String.
        System.out.println("i = " + i); //print the value of i.

    }
}
