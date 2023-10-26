package org.example.lab4.people;

public class Person {
    private String fullName;
    private String address;

    private int age;
    private String country;

    public Person(String fullName, String address){
        this.fullName = fullName;
        this.address = address;
        this.age = 0;
        this.country = "Bosnia and Herzegovina";
    }

    public Person(String fullName, String address, int age, String country){
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        this.country = country;
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getAddress(){
        return this.address;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return (this.fullName + "\n  " + this.address);
    }

}
