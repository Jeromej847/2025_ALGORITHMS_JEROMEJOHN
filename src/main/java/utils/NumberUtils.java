package utils;

public class NumberUtils {
    /**
     * find the number on the array search
     *
     * @param target being searched
     * @return the number targeted
     * @throws IllegalArgumentException if array is null or target not found
     */

    public static int getPos(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("arr is null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return target;
    }

    /**
     * find the last position on the array
     *
     * @param target being searched
     * @return the Last position on the array
     * @throws IllegalArgumentException if array is null or target not found.
     */

    public static int getLastPos(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        throw new IllegalArgumentException("arr is null");
    }


    /**
     * trying to determine whether two numbers in an array are identical
     * this is determined when two integers in an array have same elements
     * @param arr1 the first array of integers
     * @param arr2 the second array of integers
     * @return a boolean
     * @throws IllegalArgumentException if the array is nul
     * true if the number is identical and false if the number is not identical.*/

    public static boolean isIdentical(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("arr1 and arr2 is null");
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


}
