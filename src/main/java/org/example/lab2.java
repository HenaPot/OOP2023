package org.example;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){
        // each method should be called here to show their functionality
    }

    /* Create a program that asks the user for a password.
    If the password is right, a secret message is shown to the user.*/
    public static void task1(){
        Scanner reader = new Scanner(System.in);
        String correctPassword = "carrot";
        while (true) {
            System.out.println("Type the password: ");
            String userPassword = reader.next();
            if (userPassword.equals(correctPassword)) {
                System.out.println("The secret is: jryy qbar!");
                break;
            }
        }
    }

    /* Create a program that asks the user for three numbers and then prints their sum. */
    public static void task2(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.println("Type the first number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("Type the second number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("Type the third number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("Sum: " + sum);
    }
    /* Create a program that reads numbers from the user and prints their sum.
    The program should stop asking for numbers when the user enters the number 0.*/
    public static void task3(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true){
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0){
                break;
            }
            sum = sum + read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
    /* Create a program that asks the user for the first number and the last number
    and then prints all numbers between those two. Use a while loop.*/
    public static void task4() {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = reader.nextInt();
        System.out.println("Second: ");
        int second = reader.nextInt();

        while (first <= second){
            System.out.println(first);
            first++;
        }
    }
    /* Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user.
    The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16.
    In Java we cannot write ab directly, but instead we can calculate the power with the command Math.pow(number, power).
    Note that the command returns a number of double type (i.e. floating point number).
    A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
    This assigns the value of 23 to variable result. */
    public static void task5(){
        Scanner reader = new Scanner(System.in);
        int result = 0;
        System.out.println("Type a number: ");
        int power = reader.nextInt();
        for (int i = 0; i <= power; i++){
            result = result + (int)Math.pow(2, i);
        }
        System.out.println("The result is: " + result);
    }
    /* Create a method printText that prints the following string of characters:
    "In the beginning there were the swamp, the hoe and Java." and a line break.*/
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
    /* Create a method printStars that prints the given amount of stars and a line break. */
    public static void printStars(int a){
        for (int i = 0; i < a; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    /* Create a method called drawStarsPiramid that will accept the number of rows as a parameter and
    print a half piramid shape where the number of rows will be dictated by the sent parameter.*/
    public static void drawStarsPiramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // How to print the inverted half piramid shape as shown in the image below?
    public static void drawInvertedStarsPiramid(int numRows) {
        for (int i = numRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /* Modify the previously created starts piramid in a way that now you are not printing the starts
    but in each row numbers from 1 to the current row count.*/
    public static void drawNumbersPiramid(int numRows){
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void drawNumbersPiramid2(int numRows){
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
