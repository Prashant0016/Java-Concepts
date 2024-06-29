/*
ENUM :
 - An enum is a special type of class that represents a fixed set of named constants.
 - It is used to define a set of named values that have a specific meaning in the context of the program.
 - Enums are useful when you need to represent a fixed set of constants, such as choices on a menu, rounding modes, command-line flags, etc.

 - To declare an enum, you use the enum keyword instead of class or interface .
 - Can be used with switch , if , else statements .
 */


package Oops;

/*
enum Status {
    Running , Failed , Pending , Success ;
}

public class Enums {
    public static void main(String[] args) {
        Status r = Status.Running;
        Status f = Status.Failed;
        Status p = Status.Pending;
        Status s = Status.Success;
        System.out.println(r);                              // Prints Running ( Try printing others too)
    }
}


 */
// Enums with switch case

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}

