package ui;

import java.util.Arrays;
import java.util.Random;

public class Statistics {

    public static void main(String[] args) {
        //Array hardcode
        int[] code = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};

        //Random Array
        int [] randomArray = DataGenerator.getRandomArray();

        //display the arrays
        System.out.println("code:" + Arrays.toString(code));
        System.out.println("Random Array:" + Arrays.toString(randomArray));

        /**
         * find largest number in array
         * @param arr array of integers
         * @eturn largest number
         * @throw illegalArgumentException if array is null
         */
        public static int getLargest(int[]arr) {
            if (arr == null) {
                throw new IllegalArgumentException("arr is null");
            }
            int largest = arr[0];
            for (int value : arr) {
                if (value > largest) {
                    largest = value;
                }
            }
            return largest;
        }
    }
    /**
     * find first position in the array
     * @param arr array of integers
     * @param tar target integer in the array
     * @return integer which is the targeted number, if not found return -1 in code
     * @throws IllegalArgumentException if array is null
     */
     public static int getFirstPosition(int[] arr,int tar){
        if (arr == null)  {
            throw new IllegalArgumentException("arr is null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
     }

     /**
      * find the last position in the array
      * @param arr array of integers
      * @param tar target been looked for in the array code
      * @return the integer targeted in the array
      */

     public static int getLastPosition(int[] arr,int tar){
         for (int i =arr.length-1; i>=0; i--) {
             if (arr[i] == tar) {
                 return i;
             }
         }
         return -1;
     }
     //Find positions
    int firstPosition = getFirstPosition(randomArray,tar);
    int lastPosition = getLastPosition(randomArray,tar);

    System.out.println("Fist position of value" + firstPosition);
    System.out.println("Last position of value" + lastPosition);
}
