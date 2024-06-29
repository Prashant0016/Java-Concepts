/*
OPERATORS :
    1. Arithmetic             2. Assignment               3. Comparison                     4. Logical
      - addition (+)            - equals (=)                 - double equals (==)               - AND (&&)
      - subtraction (-)         - compound assignment        - not equals (!=)                  - OR (||)
      - multiplication (*)        operators such as += ,     - greater than (>)                 - NOT (!)
      - division (/)              -= , *= , /= , %=          - less than (<)
      - modulus (%)                                          - greater than equal to (>=)
      - increment (++)                                       - less than equal to (<=)
      - decrement (--)
 */

package Basic_Intro;

public class Operators {
    public static void main(String[] args) {

        // ARITHMETIC OPERATORS

        int a  = 25;                                        // Arithmetic addition
        int b = 10;
        int result = a+b;
        System.out.println("Result : " + result);           // Try with other arithmetic operators and examples !!


        // PRE-INCREMENT and POST-INCREMENT (Same goes to decrement too !)

        int c = 10;                                         // Value is incremented then fetched
        int pre = ++c;
        System.out.println(pre);                            // O/P - 11

        int d = 10;                                         // Value is fetched and then incremented
        int post = d++;
        System.out.println(post);                           // O/P - 10
        System.out.println(d);                              // O/P - 11


        // COMPARISON OPERATOR (Return boolean value , T or F)

        double first = 3.14;                                    // You can try different data-types as well !!
        double second = 3.02;                                   // Try with other comparison operators and examples !!

        System.out.println(first > second);                     // True
        System.out.println(first == second);                    // False


        // LOGICAL OPERATORS :
            /*
                1) AND - Return True if both operands are true , and if not then false .
                2) OR -  Returns True if at least one operand is true.
                3) NOT - Returns true if the operand is false and vice versa.
            */

        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        int num4 = 400;

        boolean bool_result = ( (num1<num2) && (num3>num4) );                       // true && false => false
        System.out.println("Result of AND operation : "+bool_result);               // O/P - false

        boolean bool_result1 = ( (num1<num2) || (num3>num4) );                       // true || false => true
        System.out.println("Result of OR operation : "+bool_result1);                // O/P - true

        boolean bool_result2 = !(num1<num4);                                        // this is true but NOT inverts it
        System.out.println("Result of NOT operation : "+bool_result2);              // O/P - false
    }
}
