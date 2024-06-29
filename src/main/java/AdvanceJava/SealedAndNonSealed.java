/*
1. SEALED CLASSES :
    - Sealed classes in Java are a way to restrict the set of classes that can extend a particular class.
    - When a class is declared as "sealed", the developer must specify which classes are permitted to extend it using the "permits" keyword.

2. NON SEALED CLASS :
    - Non-sealed classes do not impose restrictions on which classes can extend them.
    - Any class can extend a non-sealed class unless the class itself is final, which prevents further subclassing.
    - Non-sealed classes are the default in Java, allowing unrestricted inheritance. (i.e By default , every class is a Non-sealed class)
 */

package AdvanceJava;
import java.util.*;

// SEALED

sealed abstract class Shape permits Circle, Rectangle {                          // Creating Sealed class "Shape" with permitted subclasses
    public abstract void draw();                                                // Abstract method
}

final class Circle extends Shape {                                              // only circle and rectangle can use Shape
    public void draw() {
        System.out.println("Drawing Circle");                                   // implementation of draw method
    }
}

final class Rectangle extends Shape {
    public void draw() {                                                       // implementation of draw method
        System.out.println("Drawing Rectangle");
    }
}


// NON-SEALED

class Animal {                                                                  // BY default, they are non sealed
    public void makeSound() {                                                   // Animal cannot be final , if it is then we cannot extend
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {                                                      // Non sealed can extend any class
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class SealedAndNonSealed {
    public static void main(String[] args) {

        //SEALED

        Rectangle obj = new Rectangle();                                       // creating obj and using draw method
        Circle obj1 = new Circle();
        obj.draw();
        obj1.draw();

        //NON-SEALED

        Animal obj2 = new Animal();                                           // Creating obj and using makeSound method
        Dog obj3 = new Dog();
        obj2.makeSound();
        obj3.makeSound();

    }
}
