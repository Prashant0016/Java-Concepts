/*
INTERFACES :
    - An interface is a collection of abstract methods .
    - Any class that implements an interface must provide concrete implementations for all the methods declared in that interface.
    - It provides a way to achieve abstraction in Java .
NOTE :
    1)  for class - class => we use extends keyword
        for class - interface => we use implements keyword
        for interface - interface => we use extends keyword
    2) Any method defined in interface is implicitly public and abstract .
       Any variable/constant declaration is implicitly public , static and final .
    3) We can have multiple interfaces and multiple interfaces methods ,
       for example : Class1 implements Interface1 , Interface2{}

- Functional interface & Lambda expression :
    - A functional interface in Java is an interface that contains only one abstract method.
    - It is used to represent a single method of an object-oriented interface as a method parameter, return value, or variable.
    - Functional interfaces enable the use of lambda expressions and method references in Java.
    - A lambda expression is an anonymous function that can be passed as an argument to a method or stored in a variable.
    - It consists of a comma-separated list of parameters enclosed in parentheses, followed by an arrow token (->), and then the body of the lambda expression.

 */


package Oops;

interface demoInterface{                                                  // Creating an Interface

    void greet();                                                         // Method greet() - public and abstract

    double pie = 3.14;                                                    // Constant variable - public , static , final
}

class DemoClass implements demoInterface{                               // Implementing demoInterface by implements keyword

    public void greet(){                                                        // implementing greet method
        System.out.println("In DemoClass , method used from demoInterface");
    }
}

@FunctionalInterface
interface Adder {                                                       // Functional Interface with one abstract method
    int add(int a, int b);
}

public class Interfaces {
    public static void main(String[] args) {

        DemoClass obj = new DemoClass();                            // Creating object of DemoClass

        obj.greet();                                                // Calling the function

        System.out.println("Value of pie using interface constant pie : "+ demoInterface.pie);  // Accessing the constant via interface itself

        Adder adder = (a, b) -> a + b;                              // Using Lambda Expression and Functional Interface together
        int result = adder.add(5, 3);
        System.out.println(result);                                 // Output: 8

    }
}
