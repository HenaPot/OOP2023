package org.example.lab5.task3;

public class Thing {
    private double weight;

    public Thing(double weight){
        if (weight >= 0) {
            this.weight = weight;
        }
        else throw new IllegalArgumentException("This value is negative!");
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj){
        // this is downcasting, additional validation is recommended
        Thing thing = (Thing) obj;
        if (this.weight == thing.getWeight()){
            return true;
        }
        else {
            return false;
        }
    }

    /*@)Override
    public int hashCode*/
}
