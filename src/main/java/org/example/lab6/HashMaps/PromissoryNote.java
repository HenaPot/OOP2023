package org.example.lab6.HashMaps;

import java.util.HashMap;

public class PromissoryNote {
    HashMap<String, Double> debts = new HashMap<>();
    public void setLoan(String toWhom, double value){
        this.debts.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        double result = 0.0;
        if (debts.containsKey(whose)) {
            result = debts.get(whose);
        }
        return result;
    }

}
