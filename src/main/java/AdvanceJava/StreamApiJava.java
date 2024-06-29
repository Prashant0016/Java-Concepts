/*
1. StreamAPI :
    - The Java 8 Stream API is a powerful tool for processing collections of data in a functional, declarative way.
    - Streams provide a set of methods that allow you to filter, map, reduce, and perform other operations on collections of data.
    - We can only use stream once only , after that it'll give runtime error .

2. Map,Filter,reduce,sorted :
    - The map operation in the Stream API allows you to transform each element of a stream into a new element.
    - The filter operation in the Stream API allows you to select a subset of elements from a stream based on a given predicate
    - The reduce operation in the Stream API allows you to combine the elements of a stream into a single value.
    - The sorted operation in the Stream API allows you to sort the elements of a stream.

3. Important terms :
    - The stream() method is called on a collection (e.g., a List or Array) to create a stream of its elements.
    - The collect() method in the Java 8 Stream API is used to perform a mutable reduction operation on the elements of a stream.
    - The Collector is an interface that provides various methods to aggregate stream elements into a specific form, such as a List, Set, or Map.
    - The Collectors.toList() method returns a Collector that accumulates the input elements into a new List in encounter order.
 */


package AdvanceJava;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiJava {
    public static void main(String[] args) {

        // STREAM-API

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()                                    // Filter the list to only include even numbers
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);                                                // [2, 4, 6, 8, 10]

        List<Integer> squares = numbers.stream()                                        // Map the list to a list of squares
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);                                                    // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

        int sum = numbers.stream()                                                      // Reduce the list to the sum of all numbers
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);                                                        // 55


        // MAP

        List<Integer> Numbers = Arrays.asList(1, 2, 3, 4, 5);                           // Using map to square each number
        List<Integer> Squares = Numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println(Squares);                                                    // [1, 4, 9, 16, 25]

        // FILTER

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);              // Using filter to select only even numbers
        List<Integer> EvenNumbers = nums.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());
        System.out.println(EvenNumbers);                                                // [2, 4, 6, 8, 10]

        // REDUCE

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);                             // Using reduce to calculate the sum of all numbers
        int Sum = nums2.stream()
                       .reduce(0, (a, b) -> a + b);
        System.out.println(Sum);                                                        // 15

        //SORTED

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");        // Using sorted to sort the names alphabetically
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println(sortedNames);                                                // [Alice, Bob, Charlie, David]
    }
}
