// 12.9 Charly. This program should be able to pass the ArrayCreationTest.
package com.company;

public class ArrayCreation {
    public static double getAverage(double[] numbers){
        if (numbers.length<3)
            return 0;
        else{
            double one = numbers[0];
            double two = numbers[numbers.length/2];
            double three = numbers[numbers.length-1];
            double average = (one + two + three)/3;
            return average;
        }
    }
    public static String stringArray(String[] friends){
        String str = "";
        int length;
        if (friends.length != 5)
            return str;
        else {
            for (int a = 0; a < 5; a ++){
                length = friends[a].length();
                str += String.valueOf(length)+" ";
            }
        }
        return str;
    }
    public static String countryData(){
        int index = (int)(Math.random()*13);
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana",
                "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};
        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra",
                "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};
        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese",
                "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};
        return "The capital of " + countries[index] + " is " + capitals[index] +
                " and the primary language is " + languages[index];
    }
}
