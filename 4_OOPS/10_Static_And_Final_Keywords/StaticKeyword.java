public class StaticKeyword {
    public static void main(String[] args) {
        /*
            The static keyword in Java is used for memory management and allows members (ie variables, methods, blocks, nested classes) 
            to belong to the class rather than an object.

            a) Static Variables:-
            ------------------------
            -> Shared across all objects of the class.
            -> Stored in the class area, not the heap.
            -> Useful for constants or counters.

            Example:-
            class Counter{
                static int count = 0;      // here count is a static variable
                Counter() {
                    count++;
                    System.out.println("Object created. Count = " + count);
                }
            }
            -> Here count is a static variable, which means:
                It belongs to the class itself, not to individual objects.
                Only one copy of count exists in memory, shared by every Counter object.
                If one object changes count, all other objects see the updated value.

            Counter c1 = new Counter();  // for first object creation of the class the count becomes 1
            Counter c2 = new Counter();  // for first object creation of the class the count becomes 2
            Counter c3 = new Counter();  // for first object creation of the class the count becomes 3

            Note:- 
            -> Every time a new object is created, the same count variable is updated.
            -> If count were not static, each object would have its own separate count (all starting from 0), and the printed value would always be 1.
        */
    }
}
