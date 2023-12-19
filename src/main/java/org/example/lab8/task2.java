package org.example.lab8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// task2 class is used as the Start class
class task2 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        // this is syntax for adding multiple elements to an ArrayList at once
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(9, 6, 7, 8, 9, 10));
        GradeAnalyzer analyzer = new GradeAnalyzer(array);
        //analyzer.printSummary();

        for (Field field : analyzer.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value = field.get(analyzer);
            if (value instanceof ArrayList<?> grades){
                System.out.println("The field name is: " + field.getName() +
                        " and it's value is: " + grades);
            }
        }

        for (Method method : analyzer.getClass().getDeclaredMethods()) {
            method.setAccessible(true);
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.println("Method name is: " + method.getName() + ", Output of it is: " + method.invoke(analyzer));
            }
        }
    }
}

class Student {
    private String name;
    private String ID;
    private List<Integer> grades;

    public Student(String name, String ID, List<Integer> grades) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println("Student: " + name + ", ID: " + ID + ", Grades: " + grades);
    }
}

class GradeAnalyzer {
    private List<Integer> gradesList;

    public GradeAnalyzer(List<Integer> gradesList){
        this.gradesList = gradesList;
    }

    public double calculateGradeAverage() {
        int result = 0;
        int counter = 0;
        for (Integer i : gradesList){
            counter++;
            result += i;
        }
        return (double) result/counter;
    }

    public void printSummary(){
        System.out.println("Grades: " + this.gradesList);
        System.out.println("The average grade is: " + this.calculateGradeAverage());
    }
}

