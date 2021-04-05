package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(boyName() + relationships() + girlName());
    }
    public static String boyName (){
        public static String boyName (){
            String[] bnames={"Alvis","James","France","Jesray","Wendell"};
            return  bnames[display()];
        }
    }

    public static void girlName(){

    }

    public static void relationships(){

    }

    public static int display(){
        Random dice = new Random();
        return dice.nextInt(5);
    }
}
