package org.example.lab5.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*Book book1 = new Book("Fyodor Dostojevski", "Crime and Punishment", 2);
        System.out.println(book1);
        CD cd1 = new CD("Pink Floyd", "Dark Side Of The Moon", 1999);
        System.out.println(cd1);*/

        Box box = new Box(10);
        box.add(new Book("Fyodor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side Of The Moon", 1999));
        box.add(new CD("Wingwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer To Being Here", 2012));

        /*TEST
        box.add(new Book("Test Book", "I have 328479832748392 pages!", 10));*/

        /*TEST 2
        Try adding when you can set the ArrayList attribute. Try adding over maxWeight
        through box object and through adding via new ArrayList variable that is created in main and then
        set to be the box's attribute

        ArrayList<ToBeStored> test2 = new ArrayList<ToBeStored>();
        box.setThings(test2);
        test2.add(new Book("Test Book", "I have 328479832748392 pages!", 10));
        box.add(new Book("Test Book", "I have 328479832748392 pages!", 10));

        //line below breaks the code due to the fact ArrayList is an object and we passed a reference
        test2.add(new Book("Test Book 2", "I have too many pages!", 5));*/

        System.out.println(box);

        /*  Code below works, because interface ToBeStored has implementation of weight()

        for (ToBeStored item : box.getThings()){
            System.out.println(item.weight());
        }
            Code below does NOT work, because interface ToBeStored does NOT implement function with this signature,
            furthermore, when objects are upcasted like here, they lose 'extra' methods/attributes in child class

        for (ToBeStored item : box.getThings()){
            System.out.println(item.getWeight());
        }*/


    }
}
