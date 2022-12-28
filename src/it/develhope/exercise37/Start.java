package it.develhope.exercise37;

import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {

        LocalDate todaysDate = LocalDate.now();

        System.out.println("Days till the end of month : " + (todaysDate.lengthOfMonth() - todaysDate.getDayOfMonth()));
        System.out.println("Days till the end of years : " + (todaysDate.lengthOfYear()-todaysDate.getDayOfYear()));
    }
}
