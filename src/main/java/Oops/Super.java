/*
SUPER :
    - In Java, the super() keyword is used to call the constructor of the parent class.
    - The super() method is often used in the constructor of the child class to invoke the constructor of the parent class.

 */


package Oops;

class Parent {                                                       // Class 'Parent'
    int a, b;
    Parent(int a, int b) {                                          // Parent class constructor with parameters a and b
        this.a = a;
        this.b = b;
        System.out.println("Parent class constructor called with parameters: " + a + ", " + b);
    }

    void display() {                                               // Parent's Display Method
        System.out.println("Parent class display method: " + a + ", " + b);
    }
}

class Child extends Parent {
    int c;
    Child(int a, int b, int c) {                                  // Child class constructor with parameters a, b, and c
        super(a, b);                                              // Calling the constructor of the parent class with parameters a and b
        this.c = c;
        System.out.println("Child class constructor called with parameter: " + c);
    }

    @Override
    void display() {                                              // Child Display method
        super.display();                                          // Call the display method of the parent class
        System.out.println("Child class display method: " + c);
    }
}

public class Super {
    public static void main(String[] args) {
        Child childObj = new Child(1, 2, 3);             // Invoking the constructors via objects
        childObj.display();                                       // and methods too !!
    }
}
