/*
Variables :
    - They are used to store values .
    - Each variable has a specific data type that defines the kind of data it can hold.
    - And it also determines the operations that can be performed on the variable.

Data-types : (Primitive)
    1. byte             5. float
    2. short            6. double
    3. int              7. char
    4. long             8. boolean
 */

package Basic_Intro;

public class Variable_and_DataTypes {
    public static void main(String[] args) {                        // int is a Data-Type
                                                                    // 'a' is the variable name
        int a = 10;                                                 // value 10 gets assigned to variable a
        System.out.println(a);                                      // In '=' operator , value gets assigned from right to left


        byte b = 20;                                                // size -  8 bits
        short c = 30;                                               // size -  16 bits
        int d = 40;                                                 // size -  32 bits
        long e = 50L;                                               // size -  64 bits
        float f = 60.4f;                                            // size -  32 bits
        double g = 70.45;                                           // size -  64 bits
        char h = 'c';                                               // size -  16 bits (Only single quotes work)
        boolean i = true;                                           // values - true or false


        /*
        Type Casting :
            1. Implicit (Widening)                                            2. Explicit (Narrowing)
                - Automatic Conversion                                              - Manual conversion
                - Smaller DT converted to a Larger DT .                             - Larger DT converted to a Smaller DT .
                - No Data loss .                                                    - Data Loss may happen .
         */

        int num1 = 42;
        long num2 = num1;                  // Implicit conversion from int to long
        System.out.println(num2);

        double num3 = 3.14;
        int num4 = (int) num3;             // Explicit conversion from double to int , O/P - 3
        System.out.println(num4);


        /*
        Type-Promotion :
            -Refers to the automatic conversion of a lower-sized data type to a higher-sized data type during expressions involving different data types.
            -This is done by the compiler to prevent data loss.
        */

        byte num5 = 10;                         // byte data type (smaller / lower-sized DT)
        int num6 = 20;                          // int data type  (bigger / higher-sized DT)
        int result = num5 + num6;               // Type promotion: byte is promoted to int for the addition

        System.out.println("Result: " + result);     // O/P - 30 ( DT : int )
    }
}


