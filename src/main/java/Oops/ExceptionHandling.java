/*
1. Exception :
    - An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.

2. Exception Handling :
    - Exception handling is a mechanism in Java that allows a program to handle exceptions that may occur during its execution.
    - It involves identifying potential exceptions, catching them when they occur, and taking appropriate actions to recover from the exception.

3. Handling Using Try-catch :
   - We use try and catch keyword to handle the exceptions .
   - In try block , we write that code which could give the error or exception .
   - In catch , We handle exception by providing suitable message to the user .

4. Throw and Throws Keyword :
   - The throw keyword is used to explicitly throw an exception. It is typically used in methods to throw exceptions when certain conditions are met.
   - The throws keyword is used to declare that a method may throw an exception.

5. Customs Exceptions :
   - We can create our own exception class by extending the exception class and using super keyword.

6. Checked & Unchecked Exceptions :
   - Checked exceptions are exceptions that must be handled by the program.
   - They are typically used to handle situations where the program can recover from the exception.
   - Checked exceptions are declared in the method signature using the throws keyword.

   - Unchecked exceptions are exceptions that do not need to be handled by the program.
   - They are typically used to handle runtime errors that cannot be recovered from.
   - Unchecked exceptions are not declared in the method signature.

7. Finally Keyword :
   - Finally block always executes , used to give good message to the user .
   - We can use finally block with and without try catch .
 */


package Oops;
import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {

        // TRY-CATCH

        try {                                                                                   // try block
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (Exception e) {                                                                 // catch block
            System.out.println("You are accessing the element which does not exist !!");        // Providing a meaningful message ,We can also print 'e' to know the exception message
        } finally {
            System.out.println("I am Finally Block , I am Always Executed ");                   // Finally Block
        }


        // Throw and Throws

        try {
            throwException();                                                                   // Created a function below the main class
        } catch (Exception e) {
            System.out.println("Exception caught");
        }

        // Creating our Own Exception

        class MyException extends Exception{                                                // Creating custom exception using extend keyword
            public MyException(String s){                                                   // Creating Constructor and using super keyword
                super(s);
            }
        }
        int age = 0;
        try {
            if(age<=0){
                throw new MyException("Age Cannot be Zero !!");                            // This is our exception message i.e 'e'
            }
        } catch (Exception e){
            System.out.println("Watch what are you typing !!" + e);                        // If exceptions are caught then this will execute
        }                                                                                  // We also print our exception message using e
    }
    public static void throwException() throws Exception {
        throw new Exception("An exception was thrown");
    }

}

