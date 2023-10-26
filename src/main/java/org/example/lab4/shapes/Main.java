package org.example.lab4.shapes;

public class Main {
    public static void main(String[] args){
        Shape sh = new Shape("red", FillType.NOT_FILLED);
        Circle c = new Circle("pink", FillType.FILLED, 2);
        Rectangle rec = new Rectangle("blue", FillType.FILLED, 2, 5);

        //sh.displayInfo();
        //c.displayInfo();

        //System.out.println(c.calculateCircumference(2));
        //System.out.println(c.calculateCircumference(3.14, 2));

        sh.displayInfo();
        System.out.println();
        c.displayInfo();
        System.out.println();
        rec.displayInfo();
    }
}
