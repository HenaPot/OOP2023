package org.example.lab5.task2;

import java.util.ArrayList;

interface ToBeStored {
    //double attribute = 0; this would be a final and static attribute
    double weight();
}

class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    public double getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.writer + ": " + this.name;
    }
}

class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;

    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    public double getWeight(){
        return this.weight;
    }

    // when it comes to interfaces you always override methods in a concrete class
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}

class Box implements ToBeStored{
    private double maximumWeight;
    // Here we take advantage of upcasting !
    private ArrayList<ToBeStored> things;
    public Box(double maximumWeight){
        this.maximumWeight = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void setThings(ArrayList<ToBeStored> things){
        this.things = things;
    }

    public ArrayList<ToBeStored> getThings(){
        return this.things;
    }

    @Override
    public double weight() {
        double currentWeight = 0;
        for (ToBeStored item : this.things){
            currentWeight += item.weight();
        }
        return currentWeight;
    }

    public void add(ToBeStored thing){
        if ((this.weight() + thing.weight()) <= this.maximumWeight){
            this.things.add(thing);
        }
    }

    @Override
    public String toString(){
        return "Box: " + this.things.size() + " things, total weight: " + this.weight() + " kg";
    }
}