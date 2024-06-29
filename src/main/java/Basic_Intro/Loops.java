/*
LOOPS :
    - They are used to execute a block of code repeatedly .
    - They are of several types such as do-while , while , for , for-each
    - we take an iterator variable (popularly known as i or j) , and iterate through each item/block .
 */

package Basic_Intro;

public class Loops {
    public static void main(String[] args) {

        // WHILE LOOP

        int a = 0;                                                              // Loops runs till the cond is true
        while (a < 5) {
            System.out.println("Count: " + a);
            a++;                                                                // Incrementing the variable value
        }
        System.out.println("While Loop has ended");                             // Out of loop body as cond becomes false


        // DO-WHILE LOOP

        int i = 0;                                                             // Do-while will execute atleast once
        do {                                                                   // does not matter if the cond is true or false
            System.out.println("Value of i: " + i);
            i++;
        } while (i > 5);


        // FOR-LOOP

        for (int b = 0; b < 5; b++) {                                          // for(intialisation;cond;inc/decrement){}
            System.out.println("Value of b using FOR loop : " + b);
        }


        // FOR-EACH LOOP - simplifies iterating over arrays and collections.

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

    }


}
