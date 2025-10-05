package utils;

import java.util.Arrays;

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
     * trying to determine whether two sets of an array are identical
     * this is determined when two integers in the two sets of array are the identical
     *
     * @param arr1 the first array of integers
     * @param arr2 the second array of integers
     * @return a boolean
     * @throws IllegalArgumentException if the array is null
     *                                  true if the number is identical and false if the number is not identical.
     */

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

    /**
     * trying to determine if two sets of arrays are equal
     * in this case the arrays are not sorted out
     *
     * @param arr1 the first array
     * @param arr2 the second array
     * @return boolean
     * throw IllegalArgumentException if array is null
     */

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("arr1 and arr2 is null");
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    /**
     * Determining whether the first array of integers is a subset of the second array
     * two sets of array are a subset if the numbers on both set of arrays are in there.
     *
     * @param arr1 the first array of integers to check for subset
     * @param arr2 the second array of integers
     * @return a boolean
     * throw IllegalArgumentException if one of the array is null.
     */

    public static boolean isSubset(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays are null");
        }
        if (arr1.length >= arr2.length) {
            return false;
        }

        for (int i : arr1) {
            boolean isSubset = false;
            for (int j : arr2) {
                if (arr1[i] == arr2[j]) {
                    isSubset = true;
                    break;
                }
            }
            if (!isSubset) {
                return false;
            }
        }
        return true;
    }
    /**
     * Rturning the smallest number in an array
     * i will be looping through an array to find the smallest number in an array
     * @param arr the array of integer to search the number
     * @return the smallest number
     * @throw an IllegalArgumentException if array is null
     * */

    public static int getMax(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("arr is null");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }
}
