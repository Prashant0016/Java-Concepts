/*
INHERITANCE :
    - An Important Oops concept in which a class can inherit properties and behaviors from another class .
    - This allows for code reuse, extensibility, and the creation of a hierarchy of classes.
    - Types : Single , Multilevel [ Multiple also , through interfaces ] .
    - basic syntax : child class extends parent class OR
                     Sub class extends Super class OR       [Extends keyword is used for inheritance]
                     Base class extends Derived class       [All three statements have same meaning]
 */

package Oops;

// SINGLE LEVEL INHERITANCE

class Animal {
    void eat(){                                                    // Class Animal with 'eat' method
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{                                          // Class dog inheriting the parent class [properties]
    void bark(){                                                   // Class dog having its own method called 'bark'
        System.out.println("Dog is barking");
    }
}

// MULTI LEVEL INHERITANCE

class GrandFather{                                                 // SUPER PARENT CLASS
    void info(){
        System.out.println("In GrandFather Class ");
    }
}
class Father extends GrandFather{                                  // PARENT CLASS
    void info1(){
        System.out.println("In Father Class");
    }
}
class Son extends Father{                                         // CHILD CLASS
    void info2(){
        System.out.println("In Son Class");
    }
}


public class Inheritance {
    public static void main(String[] args) {

        // SingleLevel
        Dog obj = new Dog();                                       // Making Object of Dog class
        obj.bark();                                                // Calling method of Dog class
        obj.eat();                                                 // Calling method of Animal class , since Dog class has the access to it [by inheritance]


        // MultiLevel
        Son obj1 = new Son();                                      // Object of 'Son' class
        obj1.info2();                                              // Calling Son's method using its own object
        obj1.info1();                                              // Calling Father method using Son's Object
        obj1.info();                                               // Calling GrandFather method using Son's Object
    }
}
