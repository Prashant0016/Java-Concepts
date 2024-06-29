/*
OOPS : [Object Oriented Programming]
    - OOP is a fundamental programming approach that helps organize and structure code in a more modular and reusable manner.
    - It is a programming paradigm that revolves around the concept of "objects," which can be instances of classes.
    - Covers many topics such as classes and object , encapsulation , abstraction , polymorphism , inheritance etc.
 */

package Oops;

class Person{                                      // Creating a class named Person [ with 'class' keyword ]
    String name;                                   // 'name' and 'age' are instance variables ( or known as Attributes )
    int age;

    Person(String name , int age){                 // Creating Constructor - [It is a special method within a class that gets automatically called when an object is created from that class]
        this.name = name;                          // A constructor name should be same as the class name .
        this.age = age;                            // 'this' keyword is a reference to the current instance of the class .
                                                   // 'this' is used to refer to the instance variables .
    }

    public void display(){                                  // Creating a method to print the information .
        System.out.println("Name is : "+ name );
        System.out.println("Age is : "+ age );
    }
}



public class Classes_and_Objects {
    public static void main(String[] args) {
                                                           // Creating object of the person class
        Person obj = new Person("ABC",18);                 // Syntax - classname objectname = new classname(parameters);
        obj.display();                                     // Using method display of person class using object 'obj'.

        Person obj1 = new Person("DEF",21);                // We can create multiple objects of the same class .
        obj1.display();
    }
}
