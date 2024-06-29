/*
METHODS :
    - They are blocks of code that perform a specific task and are defined within a class.
    - Types : Instance methods and static methods .
INSTANCE METHOD :
    - It is Associated with an instance of a class and can access and modify the instance variables of that class.
    - To call an instance method, you need to create an object of the class.
STATIC METHOD :
    - A static method belongs to the class rather than an instance of the class.
    - It can be called using the class name without creating an object of the class.
 */

package Oops;

class Instance {
    int a;                                                                          // Instance variables - 'a' & 'b'
    int b;
    void add(int first , int second){                           // Instance method 'add'
        this.a = first;                                         // return type is void means it does not return anything
        this.b = second;
        int result = a+b;
        System.out.println("Result : "+result);
    }
}

class Static {
     static String display(String first , String last){             // Static method - 'display' [static keyword is used]
        return first+" "+last;                                      // return type is String means it returns String
    }
}

class Instance_and_Static {                                                // Instance and static method together
    static int count = 0;                                                  // Static variable - shared among all instances of the class

    public void increment() {                                              // Instance method to increment the count
        count++;
    }

    public static void displayCount() {                                    // Static method to display the count
        System.out.println("Count: " + count);
    }
}

public class Methods {
    public static void main(String[] args) {

        Instance obj1 = new Instance();                                     // Creating Object for Instance method
        obj1.add(5,5);                                                      // Calling the method

        String fullname = Static.display("Java","Methods");                 // Storing the return value in a variable
        System.out.println("FullName using Static method : "+fullname);     // Printing it

        Instance_and_Static obj3 = new Instance_and_Static();
        Instance_and_Static obj4 = new Instance_and_Static();               // Since 'count' is a static variable then,
        obj3.increment();                                                   // both obj3 and obj4 share the same count.
        obj4.increment();
        Instance_and_Static.displayCount();                                 // O/P - Count : 2

    }
}
