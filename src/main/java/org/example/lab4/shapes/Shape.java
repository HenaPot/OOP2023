package org.example.lab4.shapes;

public class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fillType){
        this.color = color;
        this.fillType = fillType;
    }

    public String getColor(){
        return this.color;
    }

    public FillType getFillType(){
        return this.fillType;
    }

    public void displayInfo(){
        System.out.println(this.color);
        System.out.println(this.fillType);
    }

    public double getArea(){
        return -1;
    }

}
