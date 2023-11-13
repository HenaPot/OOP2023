package org.example.lab6.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> nicknames = new HashMap<String, String>();
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        mattisNote.setLoan("Arto", 10.5);


        Dictionary dictionary = new Dictionary();
        /*
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
        */


        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        //System.out.println(dictionary.amountOfWords());


        dictionary.add("cembalo", "harpsichord");
        //System.out.println(dictionary.amountOfWords());
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");


        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

    }
}
