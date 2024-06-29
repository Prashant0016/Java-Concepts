/*
ACCESS-MODIFIERS :
    - It determine the visibility and accessibility of classes, methods, and fields in a program.
    - like , with the help of these we can set the boundary of the entity like from where it can be accessed etc.
    - Four main modifiers : public , private , protected and default.
 */

package Oops;

// PUBLIC

class Class_One {                                            // The member (class, method, or field) is accessible from any other class.
    public int publicField;

    public void publicMethod() {                            // This method can be accessible from anywhere too !!
        System.out.println("In public Method");
    }
}

// PRIVATE

class Class_Two {                                          // The member is only accessible within the same class.
    private int privateField;

    private void privateMethod() {                         // If we try to call this method , from any other class it will give error
        System.out.println("In Private method");           // Can be called from the same class only !!
    }
}

// PROTECTED

class Class_Three {                                     // The member is accessible within its own package and by subclasses .
    protected int protectedField;

    protected void protectedMethod() {                  // The variable and its method are accessible to the package oops and its subclasses .
        System.out.println("In Protected method");
    }
}

// DEFAULT [ If no access modifier is specified, it is considered to have default access, meaning it is accessible only within the same package.]

class Class_Four {                                          // Default-class , Same Package - Oops
    int DefaultField;                                       // Default-variable

    void DefaultMethod() {                                  // Default-method
        System.out.println("In Default Method");
    }
}




public class Access_Modifiers {
    public static void main(String[] args) {

        // PUBLIC
        Class_One obj1 = new Class_One();
        obj1.publicMethod();                                            // Method is accessible as it is public  [ Called from anywhere]

        // PRIVATE
        Class_Two obj2 = new Class_Two();
        //obj2.privateMethod();                                        // It will give error , as it is private [ Calling from diff class , hence gives error ]

        // PROTECTED
        Class_Three obj3 = new Class_Three();
        obj3.protectedMethod();                                        // Method is Accessible as it is protected [ Calling within the same package ]

        // DEFAULT
        Class_Four obj4 = new Class_Four();
        obj4.DefaultMethod();                                          // Method is Accessible as it is default  [ It is also accessible from the same package ]

    }
}
