package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(boyName() + relationships() + girlName());
    }
    public static String boyName (){

    }

    public static String girlName(){
        String[] gnames={"Eunice","Marifel","Anne","Marlott;
        return  gnames[dice()];
    }

    public static String relationships(){

    }

    public static int display(){
        Random dice = new Random();
        return dice.nextInt(5);
    }
}
