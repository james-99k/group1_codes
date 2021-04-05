package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(boyName() + relationships() + girlName());
    }
    public static String boyName(){

    }

    public static String girlName(){

    }

    public static String relationships(){
        String[] relationship={"relationship0","relationship1","relationship2","relationship3","relationship4","relationship5"};
        return relationship[display()];
    }

    public static int display(){
        Random dice = new Random();
        return dice.nextInt(5);
    }
}
