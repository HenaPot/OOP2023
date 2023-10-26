package org.example.lab4.shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle(String color, FillType fillType, double height, double width){
        super(color, fillType);
        this.height = height;
        this.width = width;
    }

    @Override
    public void displayInfo() {
        System.out.println(super.getColor());
        System.out.println(super.getFillType());
        System.out.println(this.height);
        System.out.println(this.width);
    }

    @Override
    public double getArea(){
        return this.height * this.width;
    }

}
