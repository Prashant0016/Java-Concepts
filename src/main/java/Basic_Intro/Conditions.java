/*
CONDITIONS :
    - They are used to control the flow of programs/statements according to certain conditions .
    - We use if , if-else , else-if and else to check conditions .
    - We can use Switch too for handling different conditions .
    - Ternary operator are short-way to write if-else in a single statement.
 */


package Basic_Intro;

public class Conditions {
    public static void main(String[] args) {

        int x = 10;                                                             // if - statement
        if (x > 5) {                                                            // syntax - if (cond) { body }
            System.out.println("x is greater than 5");
        }

        int age = 19;                                                           //if-else
        if(age>=18){                                                            // syntax - if (cond){
            System.out.println("You are Eligible to Drive");                    //              body
        }else{                                                                  //          } else {
            System.out.println("You cannot drive , You are still Young !");     //              body }
        }

        int marks = 85;                                                         // if - elif - else
        if(marks>90){                                                           // syntax - if (cond){
            System.out.println("Your Grade is A");                              //              body
        }else if (marks<90 && marks>80){                                        //           } else if (cond){
            System.out.println("Your Grade is B");                              //               body
        }else {                                                                 //           } else {
            System.out.println("Your Grade is C");                              //               body}
        }


        // TERNARY - OPERATOR ( Short-way to write if-else )

        int age1 = 15;                                                           // syntax
        String message = (age1 >= 18) ? "Adult" : "Teenager";                    // (cond) ? true cond : false cond
        System.out.println(message);


        // SWITCH - STATEMENTS

        int consecutive_days = 3;
        String dayName;

        switch (consecutive_days) {                                             // Switches finds the right case and
            case 1:                                                             // returns it and if not then default is
                dayName = "Yesterday";                                          // executed
                break;
            case 2:
                dayName = "Today";
                break;
            case 3:                                                             // we have mentioned 3 above and case 3
                dayName = "Tommorow";                                           // is executed and break also !
                break;
            default:
                dayName = "GOOD DAY";
        }
        System.out.println("Day is: " + dayName);

    }
}
