package org.example.lab4.people;

public class Teacher extends Person{
    private int salary;
    public Teacher(String fullName, String address, int salary){
        super(fullName, address);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return (super.getFullName() +
                "\n  " +
                super.getAddress() +
                "\n  " +
                "salary " + this.salary + " euros/month");
    }
}
