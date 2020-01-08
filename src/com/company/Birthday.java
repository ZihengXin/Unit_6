//1.8 Charly. This program should be able to tell you the probability of having the same birthday in 23 people.
package com.company;

public class Birthday {

    public static void main(String[] args){
        double True = 0.0;
        for(int a = 0; a < 1000; a++){
            Boolean situation = hasDupes(dates(23));
            if(situation == true){
                True++;
            }
        }
        System.out.print("The percent of times there were duplicate birthdays is " + True/10.0);
    }
    public static int[] dates(int num){
        int[] BDay = new int[num];
        for (int a = 0; a < BDay.length; a++){
            BDay[a] = (int)(Math.random()*365);
        }
        return BDay;
    }
    public static boolean hasDupes(int[] birthdays){
        boolean str = false;
        for(int a = 0; a < birthdays.length; a++){
            for(int i =a+1; i<birthdays.length; i++){
                if(birthdays[a] == birthdays[i]) {
                    str = true;
                }
            }
        }
        return str;
    }
}
