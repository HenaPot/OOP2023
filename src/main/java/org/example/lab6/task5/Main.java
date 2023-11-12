package org.example.lab6.task5;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        //Here we test our binary search
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();


        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        System.out.println(result);
    }
}
