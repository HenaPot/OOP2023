package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class lab1 {
    public static void main(String[] args) {
        greaterNum();
    }
    public static void task1() {
        System.out.println("Hena Potogija");
    }
    public static void task2(){
        System.out.println("Hello world!");
        System.out.println("(And all the people of the world)");
    }
    public static void yearToSeconds(){
        System.out.println("There are " + 365*24*3600 + " seconds in a year.");
    }
    public static void printSum(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstNum = reader.nextInt();
        System.out.println("Type another number: ");
        int secondNum = reader.nextInt();
        System.out.println("Sum of the numbers: " + (firstNum + secondNum));
    }

    public static void isPositive(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = reader.nextInt();
        if (num > 0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is not positive");
        }
    }

    public static void greaterNum(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int firstNum = reader.nextInt();
        System.out.println("Type the second number: ");
        int secondNum = reader.nextInt();

        if (firstNum > secondNum){
            System.out.println("Greater number: "+ firstNum);
        }
        else if (secondNum > firstNum){
            System.out.println("Greater number: "+ secondNum);
        }
        else {
            System.out.println("The numbers are equal!");
        }
    }
}
