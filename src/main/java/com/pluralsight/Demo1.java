package com.pluralsight;

import java.awt.desktop.SystemEventListener;

public class Demo1 {

    public static void main(String[] args){
        System.out.println("Hello World");

        char status = 'm';
        int identifier = 1;
        String name = "Nikesh";

        String greeting = "Hello " + name;
        //String greeting = "Hello" + "Nikesh";
        //String greeting = "Hello Nikesh";

        int numberOfDaysPerWeekWatchesTV = 5;
        int minutesPerDayOnDayWatchedOnAverage = 70;

        int minutesPerWeek = numberOfDaysPerWeekWatchesTV * minutesPerDayOnDayWatchedOnAverage;
        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        int hoursInWorkWeek = 35;

        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV + " week vacation every year");
        System.out.println(greeting);
    }
}
