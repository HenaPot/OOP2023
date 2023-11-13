package org.example.lab6.Generics;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Example usage with a list of any type
        List<String> originalList = List.of("apple", "banana", "cherry", "date");
        List<String> reversedList = reverseList(originalList);
        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);
    }
    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>(originalList);
        java.util.Collections.reverse(reversedList);
        return reversedList;
    }
}
