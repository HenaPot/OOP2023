package org.example.lab4.shapes;

public class Circle extends Shape{
    private double radius;
    public Circle(String color, FillType fillType, double radius){
        super(color, fillType);
        this.radius = radius;
    }

    @Override
    public void displayInfo(){
        System.out.println(super.getColor());
        System.out.println(super.getFillType());
        System.out.println(this.radius);
    }

    @Override
    public double getArea(){
        return this.radius*this.radius*3.14;
    }

    public double calculateCircumference(double PI, double r){
        return 2 * r * PI;
    }

    public double calculateCircumference(double r){
        return 2 * r * 3.14;
    }
}
