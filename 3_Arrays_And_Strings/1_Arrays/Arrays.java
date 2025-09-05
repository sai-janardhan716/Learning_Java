public class Arrays {
    public static void main(String[] args) {
        //Array is the collection of similar data type stored in contigous block of memory
        //Arrays are used to store multiple values in a single variable instead of declaring separate variables.
        //Faster access of elements
        //Index based access, Here index tell us where the element present in the memory
        //If Array size is n then the indices starts from 0 to (n-1)
        // Array Declaration
        // 1) int [] marks; --> Declaration
        //    marks = new int[5]; --> Memory Allocation
        // 2} int [] marks = new int[5]; --> Declaration + Memory Allocation
        // 3) int [] marks = {100,80,90,70,98}; --> Declaration + Initialising values
        //NOTE:
        // By default the values of array is zero
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 90;              //array elements initialising
        marks[3] = 70;
        marks[4] = 98;
        System.out.println("The size of the array is : " + marks.length); // --> .length method is used For Finding the size of array
        
        //Displaying the array by using navie method

        System.out.println(marks[0]);

        // Displaying the Array by using for loop

         for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
         }

         //Displaying the array by using for each loop

         for(int i : marks){
            System.out.println(i);
         }

         //MultiDimensional Array - Array of Array (or) Arrays inside arrays
         //In this initially the row size should be pre defined, otherwise it will through errors
         //We have to initialise the row length
         //The column length is dynamic, no need to mention it explicitly

         int[][] apartment = new int[2][4]; //--> 2D Array
         apartment[0][0] = 101;
         apartment[0][1] = 102;
         apartment[0][2] = 103;
         apartment[0][3] = 104;
         apartment[1][0] = 201;
         apartment[1][1] = 202;
         apartment[1][2] = 203;
         apartment[1][3] = 204;

         /*
               The above example looks like
               { 
                  101 102 103 104
                  201 202 203 204
               }
          */

         for(int i=0;i<apartment.length;i++){                //This loop for iterating through rows
            for(int j=0;j<apartment[i].length;j++){          //This loop is for iterating through columns
                System.out.print(apartment[i][j]);
                System.out.print(" ");
            }
            System.out.println();
         }

      //Jagged Array - A jagged array is an array whose elements are arrays, possibly of different sizes.
      
      //Iterating elements using for loop
      int nums[][] = new int[3][];
      nums[0] = new int[5];
      nums[1] = new int[3];
      nums[2] = new int[4];
      for(int i=0;i<=nums.length;i++){
         for(int j=0;j<nums[i].length;j++){
            nums[i][j] = (int)(Math.random()*100);
         }
      }

      // Iterating elements using for each loop
      for(int i[] : nums){
         for (int j : i){
            System.out.print(j);
         }
         System.out.println();
      }
   }
}
