package org.example.lab6.task7;

public class Main {
    public static void main(String[] args){
        NightSky nightSky = new NightSky(8, 4);
        nightSky.print();

        System.out.println(nightSky.starsInLastPrint());

        nightSky.print();

        System.out.println(nightSky.starsInLastPrint());
    }
}
