package org.example.lab5.task3;

import java.util.ArrayList;
import java.util.List;

class Thing extends Box{
    private double weight;
    private String name;

    public Thing(double weight, String name){
        if (weight >= 0) {
            this.weight = weight;
            this.name = name;
        }
        else throw new IllegalArgumentException("This value is negative!");
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj){
        boolean isEqual = false;
        // this is downcasting, additional validation is recommended
        if ( obj != null && obj instanceof Thing){
            // mozemo koristit  == jer se this.name racuna kao objekat...
            isEqual = (this.name == ((Thing)obj).name);
        }
        return isEqual;
    }

    @Override
    public void add(Thing thing) {

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

}

class MaxWeightBox extends Box{
    private int maxWeight;
    private int currentWeight;
    private List<Thing> box;
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= (this.maxWeight-this.currentWeight)) {
            box.add(thing);
            this.currentWeight += (int) thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        boolean found = false;
        for (Thing t : box){
            if (t.equals(thing)){
                found = true;
                break;
            }
        }
        return found;
    }
}

class OneThingBox extends Box{
    private int numOfItems;
    private List<Thing> box;
    public OneThingBox(){
        this.numOfItems = 0;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (this.numOfItems == 0){
            // radi i sa this i bez this
            this.box.add(thing);
            this.numOfItems = 1;
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        boolean found = false;
        for (Thing t : box){
            if (t.equals(thing)){
                found = true;
                break;
            }
        }
        return found;
    }

}

class BlackHoleBox extends Box{

    private List<Thing> box;

    public BlackHoleBox(){
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        box.add(thing);

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
