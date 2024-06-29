/*
ARRAYS :
    - Used to store multiple values of the same data type .
    - Supports 1D , 2D and multidimensional arrays .
    - We can use Arrays.toString() method from util.Arrays for printing only 1D arrays .
    - For printing 2D or multidimensional arrays , we need to use nested loops (means loop inside a loop) .
 */
package Basic_Intro;
import java.util.*;
public class Array {
    public static void main(String[] args) {

        //1D-ARRAY

        //int numbers[] = {1,2,3,4,5};                                                 // This one is correct as well !!
        int[] numbers = {1,2,3,4,5};
        System.out.println("Value at first position : "+numbers[0]);                   // Accessing values via indexing
        System.out.println("Basic_Intro.Array : "+Arrays.toString(numbers));           // Printing the array
        numbers[1] = 90;                                                               // Modifying values via indexing
        System.out.println("Value after updating :"+Arrays.toString(numbers));

        int size = 3;
        int[] myArray = new int[size];                                      // Creating an array of a size with 'new'
        System.out.println("myArray : "+Arrays.toString(myArray));          // By default , all values are zero


        //2D-ARRAY

        int[][] grid = new int[2][3];                                       // Creating 2D array , new int [rows][cols]
        grid[0][0]=1;                                    // Assigning values :     // [0][0] - 1st row , 1st col
        grid[0][1]=2;                                                              // [0][1] - 1st row , 2nd col
        grid[0][2]=3;                                                              // [0][2] - 1st row , 3rd col
        grid[1][0]=4;                                                              // Similarly for 2nd row ......
        grid[1][1]=5;
        grid[1][2]=6;
        for(int i=0;i<2;i++){                                                      // Printing values via loops
            for(int j=0;j<3;j++){                                                  // outer loop iterates rows
                System.out.print(grid[i][j] + " ");                                // inner loop iterates cols
            }                                                                      // used 'print' to have in same line
            System.out.println();                                       // after 1 row gets printed we move to new line
        }

        /*
            Suppose in the above example of 2D array , we dont know how many rows and col are there ,
            in that case we can use ,
                - for rows - i<grid.length (outer loop)
                - for cols - j<grid[0].length (inner loop)        [if we have same cols for every row]
                - for cols - j<grid[i].length (inner loop)        [if we have different cols for every row , also known
                                                                   as jagged array ]
        */



    }
}
