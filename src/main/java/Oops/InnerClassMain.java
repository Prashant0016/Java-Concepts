/*
1. INNER CLASS :
    - An inner class is a class that is defined inside another class (known as the outer class).
    - It's used when one class is closely related to another class and it doesn't make sense to use it outside of the outer class.
    - obj creation :
        - Innerclassname objname = new inner(); , similary for outer class
2. ANONYMOUS INNER CLASS :
    - An anonymous inner class is a local class without a name.
    - It's declared and instantiated at the same time.
    - Anonymous inner classes are useful when you need to override a method of a class or implement an interface quickly without explicitly creating a new subclass.
 */


// INNER CLASS EXAMPLE

package Oops;


class Outer {                                                             // Outer class
    private int outerField = 10 ;
    class Inner {                                                         // Inner class
        void display() {
            System.out.println("Inner class method");
            System.out.println("Outer field value: " + outerField);      // Can access variable of Outer class
        }
    }
    void outerMethod() {                                                 // Method to instantiate and use Inner class
        Inner innerObject = new Inner();
        innerObject.display();
    }
}

public class InnerClassMain {
    public static void main(String[] args) {
        Outer outerObject = new Outer();                                // Object of outer class
        outerObject.outerMethod();                                      // Method calling
    }
}




// ANONYMOUS INNER CLASS
/*
interface Greeting {                                                        // Interface with a single abstract method
    void greet();
}

public class InnerClassMain {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {                              // Anonymous inner class implementing the Greeting interface
            @Override
            public void greet() {
                System.out.println("Hello, from anonymous inner class!");
            }
        };
        greeting.greet();                                                 // Calling the method of the interface through the anonymous inner class instance
    }
}

 */






