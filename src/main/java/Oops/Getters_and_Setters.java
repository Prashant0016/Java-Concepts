/*
GETTERS AND SETTERS :
    - They are used to access and modify the private fields of a class .
    - They somehow represent encapsulation as internal details of the class are hidden, and access to the fields is controlled through methods .
    - Getter methods are used to retrieve the values of private fields.
    - Setter methods are used to update the values of private fields.
 */

package Oops;

class Student {
    private String name;                                                   // Creating Private attributes
    private int age;

    public String getName(){                                              // Getter - getName()
        return name;
    }
    public int getAge(){                                                  // Getter - getAge()
        return age;
    }

    public void setName(String newName) {                                 // Setter - setName()
        this.name = newName;                                              // existing name will be updated by newName
    }
    public void setAge(int newAge){                                       // Setter - setAge()
        if(newAge>=0){                                                    // existing age will be updated by newAge
            this.age = newAge;
        }else{
            System.out.println("Age cannot be negative");
        }
    }

}

public class Getters_and_Setters {
    public static void main(String[] args) {

        Student obj = new Student();                                     // Creating Object

        obj.setName("ABC");                                              // Using setters to update the values
        obj.setAge(19);

        System.out.println("Name : " + obj.getName());                   // Using getters to fetch the values
        System.out.println("Age : " + obj.getAge());

    }
}
