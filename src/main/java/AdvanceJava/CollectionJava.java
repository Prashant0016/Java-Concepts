/*
1. Collection in JAVA :
    - A Collection represents a group of objects known as its elements.
    - The Java Collections Framework provides a unified architecture for representing and manipulating collections, allowing them to be manipulated independent of the details of their representation.

2. Collection API , Collection , Collections :
    - Collection API refers to the concept and architecture of the Java Collections Framework .
    - Collection is an interface that is the root of the collections hierarchy. It declares methods to add, remove, clear, and iterate over elements.
    - Collections is a class that provides static methods for operating on collections, such as sorting, searching, and shuffling.

3. ArrayList , Set , Map :
    - ArrayList is a resizable-array implementation of the List interface. It allows duplicates and maintains insertion order.
    - Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
    - Map is an object that maps keys to values. A map cannot contain duplicate keys, and each key can map to at most one value.

4. Comparator and Comparable :
    - Comparator is an interface that imposes a total ordering on some collection of elements.
    - It can be used to sort a list or maintain the order of a sorted set or map.

    - Comparable is an interface that imposes a total ordering on the objects of each class that implements it.
    - The ordering imposed by this interface is referred to as the class's natural ordering.


 */



package AdvanceJava;
import java.util.*;
                                                                           // Created Class 'Movie' to demonstrate Comparable
class Movie implements Comparable<Movie> {                                // Using Implements keyword
    private double rating;                                                // Setting up attributes/variables
    private String name;
    private int year;

    public int compareTo(Movie m) {                                       // Used to sort movies by year
        return this.year - m.year;
    }
    public Movie(String nm, double rt, int yr) {                         // Constructor
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
    public double getRating() { return rating; }                        // Getter methods for accessing private data
    public String getName() { return name; }
    public int getYear() { return year; }
}

class Student {                                                          // Created classes such as Student,NameComparator,AgeComparator For Demonstrate Comparable
    int id;                                                              // Attributes / Variables
    String name;
    int age;
    public Student(int id, String name, int age) {                      // Constructor
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class NameComparator implements Comparator<Student> {                        // Comparator to sort by name
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
class AgeComparator implements Comparator<Student> {                        // Comparator to sort by age
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}



public class CollectionJava {                                               // MAIN CLASS
    public static void main(String[] args) {

        // ARRAYLIST (you can explore more methods)

        List<String> list = new ArrayList<String>();                     // List <Type> objname = new ArrayList<Type>();
        list.add("Ravi");                                               // Adding names using add method (appends the name to end of the list)
        list.add("Vijay");
        list.add("Virat");
        list.add(3,"Rohit");                                // Adding names at specified index
        list.remove(1);                                            // Remove string with index 1
        System.out.println(list);                                       // Printing the list , (we generally can't print directly with arrays)

        // SET (you can explore more of its method)

        Set<String> set = new HashSet<String>();                        // Set <Type> objname = new HashSet<Type>();
        set.add("John");
        set.add("Vijay");
        set.add("Sheldon");                                             // Similar functionality as above
        set.add("Maxx");
        set.remove("Vijay");
        System.out.println(set);                                        // It won't be sorted , will be displayed randomly unsorted .

        // Map (you can explore more of its method)

        Map<String,Integer> map = new HashMap<String,Integer>();      // Map <Type,Type> objname = new HashMap<Type,Type>();
        map.put("Arun", 79);                                          // Inserting entries in the Map using put() method
        map.put("Mohit", 82);
        map.put("Sarthak", 91);                                       // Suppose they represent as (Student : Marks) relation

        for (Map.Entry<String, Integer> e : map.entrySet())           // Iterating over Map
        {
            System.out.println(e.getKey() + ':' + e.getValue());      // Printing key-value pairs , won't be in sequence , will be unsorted
        }

        // For Sorted order (either ascending or descending) , we can use TreeMap instead of HashMap in obj creation.

        // COMPARABLE

        ArrayList<Movie> list2 = new ArrayList<Movie>();                                // Obj Creation
        list2.add(new Movie("Force Awakens", 8.3, 2015));                     // Adding DATA
        list2.add(new Movie("Star Wars", 8.7, 1977));
        list2.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list2.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list2);                                                        // Sorting

        System.out.println("Movies after sorting : ");
        for (Movie movie : list2) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());     // Using getters
        }

        // COMPARATOR

        List<Student> students = new ArrayList<>();                                     // obj creation
        students.add(new Student(1, "Jai", 21));                           // Adding data
        students.add(new Student(2, "Vijay", 23));
        students.add(new Student(3, "Ajay", 27));

        Collections.sort(students, new NameComparator());                        // Sort by name
        System.out.println("Sorted by Name:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }

        Collections.sort(students, new AgeComparator());                         // Sort by age
        System.out.println("\nSorted by Age:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }

    }
}



