package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(boyName() + relationships() + girlName());
    }
    public static String boyName (){

    }

    public static String girlName(){

    }

    public static String relationships(){
        String[] relation={"relation0","relation1","relation2","relation3","relation4","relation5"};
        return relation[display()];

    }

    public static int display(){
        Random dice = new Random();
        return dice.nextInt(5);
    }
}
