package org.example.lab9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    List<Student> students;
    private String fileName;

    public StudentSystem(String fileName) throws IOException {
        students = readStudents(fileName);
    }

    public static List<Student> readStudents(String fileName) throws IOException {
        List<Student> students = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> lines = reader.lines().toList();

            for (String line : lines) {
                String[] studentParts = line.split(",");

                Student s = new Student(
                  Integer.parseInt(studentParts[0]),
                  studentParts[1],
                  studentParts[2],
                  studentParts[3],
                  Double.parseDouble(studentParts[4])
                );

                students.add(s);
            }

        } catch (FileNotFoundException exception) {
            throw new RuntimeException();
        }

        return students;
    }

    public Optional<Student> getStudentByID(int studentID) {
        for (Student student : students){
            if (student.getID() == studentID)
                return Optional.of(student);
        }
        return Optional.empty();
    }

    public Student getHighestGPAStudent() {
        Student bestStudent = students.getFirst();
        try {
            for (Student student : students) {
                if (student.getGPA() > bestStudent.getGPA())
                    bestStudent = student;
            }
            return bestStudent;
        }
        catch (EmptyStudentListException exception) {
            throw new EmptyStudentListException("the student list is empty");
        }
    }

    public Student getLongestNameStudent() {
        if (students.isEmpty())
            throw new EmptyStudentListException("the student list is empty");

        Student longestNamedStudent = students.getFirst();
        for (Student student : students) {
            if (student.getName().length() > longestNamedStudent.getName().length())
                longestNamedStudent = student;
        }
        return longestNamedStudent;
    }
}
