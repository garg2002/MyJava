/*  Program to find the range of primitive data types in Java */

// DataTypes are the keywords which are used to allocate memory for the variables.
// DataTypes: byte, short, int, long, float, double, char, boolean.
public class DataSizeRange {
    public static void main(String[] args) {

        System.out.println("Byte range:");
        System.out.println("  min: " + Byte.MIN_VALUE);
        System.out.println("  max: " + Byte.MAX_VALUE);
        System.out.println("  Byte Bytes:"+ Byte.BYTES);

        /********************************************** */
        System.out.println("Short range:");
        System.out.println("  min: " + Short.MIN_VALUE);
        System.out.println("  max: " + Short.MAX_VALUE);
        System.out.println("  Short Bytes:"+Short.BYTES);

        /********************************************** */

        System.out.println("Integer range:");
        System.out.println("  min: " + Integer.MIN_VALUE);
        System.out.println("  max: " + Integer.MAX_VALUE);
        System.out.println("  Integer Bytes:"+ Integer.BYTES);

        /********************************************** */

        System.out.println("Long range:");
        System.out.println("  min: " + Long.MIN_VALUE);
        System.out.println("  max: " + Long.MAX_VALUE);
        System.out.println("  Long Bytes:"+Long.BYTES);

        /********************************************** */

        System.out.println("Float range:");
        System.out.println("  min: " + Float.MIN_VALUE);
        System.out.println("  max: " + Float.MAX_VALUE);
        System.out.println("  Float Bytes:"+ Float.BYTES);

        /********************************************** */

        System.out.println("Double range:");
        System.out.println("  min: " + Double.MIN_VALUE);
        System.out.println("  max: " + Double.MAX_VALUE);
        System.out.println(" Double  Bytes:"+Double.BYTES);

        /********************************************** */

        System.out.println("Character range:");
        System.out.println("  min: " + Character.MIN_VALUE);
        System.out.println("  max: " + Character.MAX_VALUE);
        System.out.println("  Character Bytes:"+Character.BYTES);

        /********************************************** */

        System.out.println("Boolean range:");
        System.out.println("  min: " + Boolean.FALSE);
        System.out.println("  max: " + Boolean.TRUE);
       

    }
}
