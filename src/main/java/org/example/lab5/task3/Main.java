package org.example.lab5.task3;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //upcasting
        Thing hena = new Thing(2, "Hena Potogija");
        MaxWeightBox maxBox = new MaxWeightBox(10);
        OneThingBox oneThingBox = new OneThingBox();
        BlackHoleBox blackHoleBox = new BlackHoleBox();

        // we can cast these to abstract class variable
        Box box1 = (Box) hena;
        Box box2 = (Box) maxBox;
        Box box3 = (Box) oneThingBox;
        Box box4 = (Box) blackHoleBox;

        /* the following code does not work because thing is cast to be Box and can
        only have functions and attributes that are associated with it
        System.out.println(box1.getWeight);*/

        //downcasting
        if (box1 instanceof Thing){
            hena = (Thing) box1;
        }
        if (box2 instanceof MaxWeightBox){
            maxBox = (MaxWeightBox) box2;
        }
        if (box3 instanceof OneThingBox){
            oneThingBox = (OneThingBox) box3;
        }
        if (box4 instanceof BlackHoleBox){
            blackHoleBox = (BlackHoleBox) box4;
        }
    }

}
