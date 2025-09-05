public class Practice {
    public static void main(String[] args){
        //problem1 - creating an array (float) and add the values
        // float [] arr = {10.00f,20.01f,30.00f};
        // float result = 0;
        // for(int i = 0;i<arr.length;i++){
        //     result+=arr[i];
        // }
        // System.out.println(result);

        //problem 2 - given integer present or not

        // int [] arr = {10,20,25,35,496,80};
        // int num = 496;
        // boolean isinarray = false;
        // for(int i : arr){
        //     if(i==num){
        //         isinarray = true;
        //         break;
        //     }
        // }
        // if(isinarray){
        //     System.out.println("Element present");
        // }
        // else{
        //     System.out.println("not present");
        // }

        //problem 3 - Caluclating the average of marks present in array

        // int [] arr = {90,85,68,76,98,89,90};
        // int avg = 0;
        // for(int i : arr){
        //     avg+=i;
        // }
        // System.out.println((float)avg/arr.length);

        //problem 4 - addition of two matrices of sizes 2x3

        // int [][]matr1 = {{1,2,3},{4,5,6}};
        // int [][]matr2 = {{1,2,3},{4,5,6}};
        // int [][]result = {{0,0,0},{0,0,0}};
        // for(int i=0;i<matr1.length;i++){
        //     for(int j=0;j<matr1[i].length;j++){
        //         result[i][j] = matr1[i][j] + matr2[i][j];
        //         System.out.print(result[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //problem 5 - reverse an array

        // int[] arr = {1,2,3,4,5,6};
        // int result;
        // for(int i=0;i<arr.length/2;i++){
        //     result = arr[i];
        //     arr[i] = arr[arr.length-1-i];
        //     arr[arr.length-1-i] = result;
        // }
        // for(int ele : arr){
        //     System.out.println(ele);
        // }

        //problem 6 - finding the maximum element in an arrauy

        // int[] arr = {10,20,80,70,155,98,100};
        // int max = 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        //problem 7 - chacks whether the array is sorted or not

        // boolean issorted = true;
        // int[] arr = {1,2,0,4,5};
        // for(int i= 0 ; i<arr.length-1 ; i++){
        //     if(arr[i]>arr[i+1]){
        //         issorted = false;
        //         break;
        //     }
        // }
        // if(issorted){
        //     System.out.println("The array elements are in order");
        // }else{
        //     System.out.println("not sorted");
        // }

        //Problem 8 - Even and odd count in the array
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // int evenCount = 0;
        // int oddCount = 0;
        // for(int i : arr){
        //     if(i%2 == 0){
        //         evenCount++;
        //     }else{
        //         oddCount++;
        //     }
        // }
        // System.out.println("Even count = "+evenCount);
        // System.out.println("Odd count = "+oddCount);
    }
}
