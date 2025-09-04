public class ForEachLoop {
    public static void main(String[] args) {
    /*
        For-Each Loop - An enhanced for loop
        ------------------------------------------
        -> The enhanced for loop (also called for-each loop) is a simpler way to iterate over arrays or collections.  
        -> It removes the need for using index values and makes the code more readable.  
        -> Best used when you want to traverse all elements without modifying the original collection.  

        Syntax:
        -------
        for (datatype variable : array) {
            use variable inside loop
        }

        In short:
        -> No need for initialization, condition, and increment manually.
        -> Directly accesses each element in sequence.

        Example
        -----------
        int[] numbers = {10, 20, 30, 40};

        for(int num : numbers) {
            System.out.println(num);
        }

        Output:
        10
        20
        30
        40

        Explanation:
        Each element of the array is assigned to `num` one by one.

        Limitations of Enhanced For Loop
        --------------------------------------
        -> Cannot modify elements directly (only read).
        -> No access to index of elements.
        -> Not useful when partial traversal or custom step iteration is required.
        
    */
    }
}
