package org.example.lab4.people;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int credit;
    private int studentId;

    // cannot have a primitive data type double, only object Double
    private ArrayList<Double> grades;
    public Student(String fullName, String address) {
        super(fullName, address);
        this.credit = 0;
        this.studentId = 0;
        this.grades = new ArrayList<>();
    }

    public Student(String fullName, String address, int studentId, ArrayList<Double> grades){
        super(fullName, address);
        this.credit = 0;
        this.studentId = studentId;
        this.grades = grades;
    }

    public String credits(){
        return String.valueOf(this.credit);
    }
    public void study(){
        this.credit += 1;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ArrayList<Double> getGrades(){
        return this.grades;
    }

    public void setGrades(ArrayList<Double> grades){
        this.grades = grades;
    }

    public void addGrade(Double grade) throws IllegalArgumentException{
        // you cannot give me a bad grade :3
        if (grade <= 6.0){
            throw new IllegalArgumentException();
        }
        this.grades.add(grade);
    }

    @Override
    public String toString(){
        return super.getFullName() + "\n  " + super.getAddress() + "\n  credits: " + this.credit;
    }
}
