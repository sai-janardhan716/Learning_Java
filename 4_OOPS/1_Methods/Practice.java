public class Practice {
    public static void main(String[] args) {
    /* 
        Practice Problems
        -----------------------------
        1) Write a function to calculate the factorial of a number.
        2) Create a function to check if a number is prime.
        3) Write a method that takes a string and returns it in reverse.
        4) Write a method which returns the sum of all elements in the array.
        5) Create a method to find the maximum element in an array.
    */
    /* 
        //Solutions

        1) Factorial of a number
        class Factorial {
            static int factorial(int n) {
                int fact = 1;
                for(int i = 1; i <= n; i++) {
                    fact *= i;
                }
                return fact;
            }
        }
        public class Main {
            public static void main(String[] args) {
                System.out.println("Factorial of 5: " + Factorial.factorial(5));
            }
        }

        2) Check if a number is prime
        class IsPrime {
            static boolean isPrime(int n) {
                if(n <= 1) return false;
                for(int i = 2; i <= Math.sqrt(n); i++) {
                    if(n % i == 0) return false;
                }
                return true;
            }
        }
        public class Main {
            public static void main(String[] args) {
                System.out.println("Is 7 prime? " + IsPrime.isPrime(7));
                System.out.println("Is 10 prime? " + IsPrime.isPrime(10));
            }
        }

        3) Reverse a string
        class StringUtils {
            static String reverse(String str) {
                return new StringBuilder(str).reverse().toString();
            }
        }
        public class Main {
            public static void main(String[] args) {
                System.out.println("Reversed: " + StringUtils.reverse("Sai"));
            }
        }

        4) Sum of all elements in an array
        class SumArray {
            static int sum(int[] arr) {
                int total = 0;
                for(int num : arr) {
                    total += num;
                }
                return total;
            }
        }
        public class Main {
            public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5};
                System.out.println("Sum: " + SumArray.sum(arr));
            }
        }

        Find maximum element in an array
        class MaxArray {
            static int max(int[] arr) {
                int max = arr[0];
                for(int num : arr) {
                    if(num > max) max = num;
                }
                return max;
            }
        }
        public class Main {
            public static void main(String[] args) {
                int[] arr = {10, 50, 20, 70, 40};
                System.out.println("Maximum: " + MaxArray.max(arr));
            }
        }
    */
    }
}
