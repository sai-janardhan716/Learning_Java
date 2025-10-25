public class MultiThreading {
    public static void main(String[] args) {
        // Multithreading
        /*
            -> Multithreading is a feature in Java that allows the concurrent execution of two or more parts of a program (called threads) to maximize CPU utilization.
            -> Each part of such a program is called a thread, and each thread defines a separate path of execution
            For example:
            -> One thread may handle user input,
            -> Another may perform background calculations,
            -> Another may update the user interface.
            Simultaneously

            Main Thread:-
            -> Every Java program starts with a main thread.
            -> When you run a program, the JVM automatically creates this thread to execute the main() method.
            class MainThreadExample {
                public static void main(String[] args) {
                    System.out.println("Current thread: " + Thread.currentThread().getName());
                }
            }

            // Output : Current thread: main
        */

        // Creating threads in java
        // There are 2 approaches for creating a thread in java
        // 1) By Extending the Thread Class
        /*
        Steps:
            -> Create a class that extends Thread.
            -> Override the run() method — this is the code that the thread will execute.
            -> Create an object of your class and call the start() method (not run()).
            class MyThread extends Thread {
                public void run() {
                    for(int i = 1; i <= 5; i++) {
                        System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                        try {
                            Thread.sleep(500); // pauses thread for 0.5s
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                }
            }
            public class ThreadExample {
                public static void main(String[] args) {
                    MyThread t1 = new MyThread();
                    MyThread t2 = new MyThread();
                    t1.start();  // starts new thread
                    t2.start();  // starts another thread
                }
            }
        */

        // By Implementing the runnable interface
        /*
        Steps:-
            -> Create a class that implements Runnable.
            -> Implement the run() method.
            -> Create a Thread object and pass your Runnable object to it.
            -> Start the thread using start().
            class MyRunnable implements Runnable {
                public void run() {
                    for(int i = 1; i <= 5; i++) {
                        System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                }
            }
            public class RunnableExample {
                public static void main(String[] args) {
                    MyRunnable obj = new MyRunnable();
                    Thread t1 = new Thread(obj);
                    Thread t2 = new Thread(obj);
                    t1.start();
                    t2.start();
                }
            }
        */

        //Important Methods
        /* 
        +-----------------------------------+----------------------------------------------------------+
        | Method                            | Description                                              |
        | --------------------------------- | -------------------------------------------------------- |
        | `start()`                         | Starts a new thread (calls `run()` internally)           |
        | `run()`                           | Defines the thread’s task (do **not** call directly)     |
        | `sleep(ms)`                       | Makes thread pause for given milliseconds                |
        | `join()`                          | Waits for a thread to finish before continuing           |
        | `setName()` / `getName()`         | Sets/gets thread name                                    |
        | `setPriority()` / `getPriority()` | Sets/gets priority (1–10)                                |
        | `isAlive()`                       | Checks if thread is still running                        |
        | `yield()`                         | Pauses the current thread to give other threads a chance |
        | `interrupt()`                     | Interrupts a sleeping or waiting thread                  |
        +-----------------------------------+----------------------------------------------------------+
        */

        // Thread Life Cycle:-
            // A thread goes through several states:
            // New -> Thread created but not started
            // Runnable -> Thread is ready to run
            // Running -> Thread is executing
            // Blocked/Waiting -> Thread is waiting/sleeping
            // Terminated -> Thread has finished execution
        /*
        class Task1 extends Thread {
            public void run() {
                for(int i = 1; i <= 3; i++) {
                    System.out.println("Task 1 - Step " + i);
                }
            }
        }

        class Task2 implements Runnable {
            public void run() {
                for(int i = 1; i <= 3; i++) {
                    System.out.println("Task 2 - Step " + i);
                }
            }
        }

        public class MultiThreadDemo {
            public static void main(String[] args) {
                Task1 t1 = new Task1();
                Thread t2 = new Thread(new Task2());

                t1.start();
                t2.start();
            }
        }
        */

    }
}
