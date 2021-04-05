package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int i = 1;

        while(i <= 10) {
            System.out.println(boyName() + relationships() + girlName());
            i++;
        }
    }

   public static String boyName(){
        String[] bnames={"Alvis ","James ","France ","Jesray ","Wendell "};
        return  bnames[display()];
    }

    public static String girlName(){
        String[] gnames={"Eunice ","Marifel ","Anne ","Marlott ", "Trisha"};
        return  gnames[display()];
    }

    public static String relationships(){
        String[] relation={"Hates ","Loves ","is mad with ", "Likes " , "is angry with "};
        return relation[display()];
    }

    public static int display(){
        Random dice = new Random();
        return dice.nextInt(5);
    }
}
