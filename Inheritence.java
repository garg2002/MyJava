class A{
    void show()
    {
        System.out.println("This is Show Method inside Base Class - A");
    }
}

class B extends A{
    void display()
    {
        System.out.println("This is Display Method inside Derived Class - B");
    }
}

/**
 * Inheritence
 */
public class Inheritence {

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.display();
    }
}