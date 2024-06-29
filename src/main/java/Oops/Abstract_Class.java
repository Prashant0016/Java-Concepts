/*
ABSTRACT CLASS :
    - It is a class that cannot be instantiated (can't create object of abstract class) on its own and is typically used as a base class for other classes.
    - An abstract method is a method without a body, and it must be implemented by any concrete (non-abstract) subclass .
    - Abstract variables are not allowed in Java . [ Instance variables are allowed ]
 */

package Oops;

abstract class Shape{                                                            // abstract class 'Shape'
    abstract void draw();                                                        // abstract method 'draw' with no body
}

class Circle extends Shape{                                                     // Class circle extending base class
    void draw(){                                                                // Implementing draw()
        System.out.println("Drawing a Circle using Shape method - 'draw()' ");
    }
}

class Square extends Shape{                                                     // Class square extending base class
    void draw(){                                                                // Implementing draw()
        System.out.println("Drawing a Square using Shape method - 'draw()' ");
    }
}



public class Abstract_Class {
    public static void main(String[] args) {
        Circle obj = new Circle();                                          // Creating object of sub class and not the abstract one
        Square obj1 = new Square();
        obj.draw();                                                         // Calling the method
        obj1.draw();
    }
}
