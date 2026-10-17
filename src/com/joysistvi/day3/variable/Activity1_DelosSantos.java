package com.joysistvi.day3.variable;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Activity1_DelosSantos {
    public static void main(String[] arg) {
        String phone1 = "iphone";
        String phone2 = "samsung";
        System.out.println("I will buy " + phone1 + " over " + phone2 + " if and only if, i have money");

        boolean is_available = true;
        is_available = false;

        System.out.println("is the " + phone1 + " for sale? " + is_available);

        int year = 2002;
        byte age = 23;
        long height = 180;
        char c = 'c';
        char m = 'm';
        System.out.println("How old are you? " + "I am " + age );
        System.out.println("when were you born? " + "I was born in November 12, " + year);
        System.out.println("Really? what is your current height then? " + "I am currently at " + height + " " +c+m);

        float big = 1.234567f;
        double small =1.123456789d;
        System.out.println("is " + big + " bigger than " + small + "?");
        System.out.println("just remember that numbers that contains many decimals is smaller compare to those that contains a little");







    }
}
