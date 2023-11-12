package org.example.lab6.task5;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue){
        int low = 0;
        int high = array.length-1;
        while (low <= high){
            int middle = low + ((high - low)/2);
            if (array[middle] < searchedValue){
                low = middle + 1;
            }
            else if (array[middle] > searchedValue){
                high = middle - 1;
            }
            else if (array[middle] == searchedValue){
                return true;
            }
        }
        return false;
    }
}
