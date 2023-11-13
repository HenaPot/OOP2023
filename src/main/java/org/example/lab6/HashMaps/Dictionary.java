package org.example.lab6.HashMaps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> words = new HashMap<>();
    public String translate(String word){
        if (words.containsKey(word)){
            return words.get(word);
        }
        return null;
    }

    public void add(String finnish, String english){
        words.put(finnish, english);
    }

    public int amountOfWords(){
        int counter = 0;
        for (String key : words.keySet()){
            counter++;
        }
        return counter;
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : words.keySet()){
            translationList.add(key.concat(" = ").concat(words.get(key)));
        }
        return translationList;
    }
}
