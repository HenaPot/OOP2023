package org.example.lab6;

public class MethodTasks {
    public static void main (String[] args){
    int[] numbers = {0, 23,4, 34, 234324};
    /*System.out.println("smallest number: " + String.valueOf(smallest(numbers)));
    System.out.println("smallest index: " + indexOfSmallest(numbers));
    System.out.println("smallest index from 2: " + indexOfSmallestStaringFrom(numbers, 2));
    swap(numbers, 0, 4);
    for (int num : numbers) {
        System.out.print(num + " ");
    }*/
        printElegantly(numbers);

    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for (int element : array){
            if (element < smallest){
                smallest = element;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int index = 0;
        int smallest = array[index];
        for (int i = 1; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestStaringFrom(int[] array, int index){
        int smallest = array[index];
        for (int i = index; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                //System.out.println(smallest);
                index = i;
            }
        }
        //System.out.println(smallest);
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    // task 6
    public static void printElegantly(int[] array){
        for (int i = 0; i < array.length-1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1]);
    }
}
