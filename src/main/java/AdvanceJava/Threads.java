/*
1. THREADS :
    - A thread is a lightweight process within a process. It is a path of execution within a process.
    - Threads are used to improve the efficiency and responsiveness of a program by allowing multiple tasks to run concurrently.
    - This is particularly useful in applications where multiple tasks need to be performed simultaneously, such as handling user input etc.

2. Creating a thread :
    - It is created by extending the thread class . It always contain a method called run .
    - We execute our thread by calling start method.
    - We can also make a thread by implementing Runnable interface .

3. Thread Priority & Thread Sleep :
    - Thread priority determines the order in which threads are executed. Higher-priority threads are executed before lower-priority threads.
    - We can set max,min etc priority using Thread.setPriority method and choosing desirable priority etc .
    - Thread sleep is used to pause a thread for a specified amount of time.
    - We can use sleep function using Thread.sleep() .

4. Race Condition :
    - A race condition occurs when multiple threads access and modify shared data, leading to unpredictable results.
 */


package AdvanceJava;
import java.util.*;


// To Perform Parallel Operation extending thread class .
// Try Creating two classes extending thread class and override the run method and use sleep function


class MyThread extends Thread {                                                         // extending thread class
    public void run() {                                                                 // overriding run method
        System.out.println("This code is running in a thread");
    }
}

// By Implementing Runnable Interface

class MyRunnable implements Runnable {                                                  // implementing runnable class
    public void run() {                                                                 // run method
        System.out.println("This code is running in a thread");
    }
}

public class Threads{
    public static void main(String[] args) {
        MyThread thread = new MyThread();                                               // Creating object
        thread.start();                                                                 // Using inbuilt start method
        System.out.println("This code is outside of the thread");

        MyRunnable runnable = new MyRunnable();                                         // Creating Object
        Thread thread2 = new Thread(runnable);
        thread2.start();                                                                // start method


    }
}
