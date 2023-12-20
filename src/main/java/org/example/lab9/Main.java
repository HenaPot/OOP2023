package org.example.lab9;

import java.util.Optional;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    try {
        StudentSystem system = new StudentSystem("students.csv");

        for (Student student : system.students) {
            System.out.println(student);
        }

        try {
            Optional<Student> student = system.getStudentByID(10);
            System.out.println(student.orElseThrow(() -> new StudentNotFoundException("Student not found")));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Student highestGPAStudent = system.getHighestGPAStudent();
        System.out.println("\nStudent with the highest GPA is " + highestGPAStudent.getName() + " with the GPA " + highestGPAStudent.getGPA() + " from the " + highestGPAStudent.getUniversity() + " studies " + highestGPAStudent.getDepartment());

        Student longestNameStudent = system.getLongestNameStudent();
        System.out.println("\nStudent with the longest name: " + longestNameStudent.getName());
    }
    catch (IOException e) {
        System.out.println("Cannot read the file, the message of the exception is: " + e.getMessage());
    }
    }
}

