package org.example.lab6.Generics;

import java.util.List;

public class EvenAndOdd {
    public static <T extends Number> SumResult sumEvenOdd(List<T> numbers){
        int evenSum = 0;
        int oddSum = 0;

        for (T number : numbers){
            if (number.intValue() % 2 == 0){
                evenSum+= number.intValue();
            }
            else {
                oddSum+= number.intValue();
            }
        }
        return new SumResult(evenSum, oddSum);
    }
}


