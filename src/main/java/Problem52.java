/*
It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 */

import java.util.Arrays;
import java.util.HashSet;

public class Problem52 {

    int max = Integer.MAX_VALUE;

    public int findSmallestInteger() {
        int[] numbers = new int[6];
        char c = '1';
        int n = (int)c;
        for(int i = 1; i < max; i++) {
            int[] int1 = bubbleSort(castCharToInt(String.valueOf(i).toCharArray()));
            int[] int2 = bubbleSort(castCharToInt(String.valueOf(i * 2).toCharArray()));
            int[] int3 = bubbleSort(castCharToInt(String.valueOf(i * 3).toCharArray()));
            int[] int4 = bubbleSort(castCharToInt(String.valueOf(i * 4).toCharArray()));
            int[] int5 = bubbleSort(castCharToInt(String.valueOf(i * 5).toCharArray()));
            int[] int6 = bubbleSort(castCharToInt(String.valueOf(i * 6).toCharArray()));
            if(Arrays.equals(int1,int2) && Arrays.equals(int2,int3) && Arrays.equals(int3,int4) &&
                    Arrays.equals(int4,int5) && Arrays.equals(int5,int6)) {
                return i;
            }
        }
        return 0;
    }

    public int[] castCharToInt(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for(int i = 0; i < charArray.length; i++) {
            intArray[i] = (int)charArray[i];
        }
        return intArray;
    }

    public int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int tmp;
        while (!sorted){
            sorted = true;
            for(int i=0; i<array.length-1; i++){
                if(array[i] > array[i+1]){
                    tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
