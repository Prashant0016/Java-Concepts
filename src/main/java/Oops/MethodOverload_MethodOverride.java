/*
METHOD-OVERLOADING : [COMPILE-TIME POLYMORPHISM]
    - It is a feature in Java that allows a class to have more than one method with the same name .
    - Parameters are different in that method .
    - The decision on which method to invoke is made at compile-time based on the method signature.
    - The compiler determines the appropriate method to be called by checking the number, type, and order of parameters.

METHOD-OVERRIDING : [RUN-TIME POLYMORPHISM]
    - In this , a subclass provides a specific implementation for a method that is already defined in its superclass.
    - The overridden method in the subclass should have the same signature (name, return type, and parameters) as the method in the superclass.
    - The decision on which method to invoke is made at runtime.
 */


package Oops;

// METHOD-OVERLOADING

class MathOP{
    public int add(int a ,int b){                       // Creating method 'add' with two parameters
        return a+b;
    }
    public int add(int a ,int b,int c){                // Creating method 'add' with three parameters
        return a+b+c;
    }
}

// METHOD-OVERRIDING

class Animals {
    void makeSound() {                                                  // Class Animal with makesound method
        System.out.println("Animal makes a sound");
    }
}
class Dogs extends Animals {                                           // Class Dogs with makesound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


public class MethodOverload_MethodOverride {
    public static void main(String[] args) {

        // METHOD-OVERLOADING

        MathOP obj = new MathOP();                                  // Creating Object
        System.out.println(obj.add(2,4));                           // Calling with two parameters
        System.out.println(obj.add(2,4,6));                         // Calling with three parameters

        // METHOD-OVERRIDING

        Dogs obj1 = new Dogs();                                    // Creating Object of Dogs class
        obj1.makeSound();                                          // Calling method using that class object

        Animals obj2 = new Animals();                              // Creating Object of Animals class
        obj2.makeSound();                                          // Calling method using that class object


    }
}
