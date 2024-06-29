/*
STRINGS :
    - It is an object that represents a sequence of characters.
    - Immutable , means value can not be changed .
MUTUABLE STRINGS :
    - Includes StringBuilder and StringBuffer . [Both are similar]
    - Has a variety of methods that we can use .
 */

package Basic_Intro;
public class Strings {
    public static void main(String[] args) {

        //STRINGS

        //String str = new String("Hello World !");                     // This is correct too !!
        String str = "Hello World !";
        System.out.println(str);

        //SOME STRING METHODS   [ Check out more methods too ! ]

        System.out.println(str.length());                              // returns length of the string
        System.out.println(str.charAt(3));                             // returns character at specified index
        System.out.println(str.substring(0,5));                        // returns a part of string,(startindex,endindex)
        System.out.println(str.concat("And JAVA too"));                // adds a string to the existing string
        System.out.println(str.equals("Python"));                      // checks if two strings are equal,return T or F


        //STRING-BUILDER [ Explore More Methods too ! ]
        /*
            - It is not synchronised means it is not thread safe .
            - Efficient than StringBuffer .
            - Better Performance than StringBuffer .
            - Preferred in : SINGLE THREADED ENVIRONMENT
        */

        StringBuilder str1 = new StringBuilder("Hello");
        str1.append(", World!");                                        // Appends ", World!" to the StringBuilder
        String result = str1.toString();                                // Converts StringBuilder to String
        System.out.println(result);

        //STRING-BUFFER [ Explore More Methods too ! ]
        /*
            - It is synchronised means it is thread safe .
            - This synchronization can add some overhead, making it slightly less efficient than StringBuilder.
            - Preferred in : MULTI THREADED ENVIRONMENT
        */

        StringBuffer str2 = new StringBuffer("Hello");
        str2.append(", World!");                                       // Appends ", World!" to the StringBuffer
        String result1 = str2.toString();                              // Converts StringBuffer to String
        System.out.println(result1);

    }
}
