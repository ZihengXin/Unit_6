package com.company;
public class EnhancedForLoops {
    public static String printStandardFor(String[] arr){
        String str = "";
        for (int a = 0; a < arr.length; a++){
        str += arr[a] + " ";}
        return str;
    }
    public static String printStandardFor(int[] arr){
        String str = "";
        for (int a = 0; a < arr.length; a++){
            str += arr[a] + " ";}
            return str;
        }
    public static String printStandardFor(double[] arr) {
        String str = "";
        for (int a = 0; a < arr.length; a++){
            str += arr[a] + " ";}
        return str;
    }
    public static String printEnhancedFor(String[] arr){
        String str = "";
        for(String x:arr){
            str += x + " ";
        }
        return str;
    }
    public static String printEnhancedFor(int[] arr){
        String str = "";
        for(int x:arr){
            str += x + " ";
        }
        return str;
    }
    public static String printEnhancedFor(double[] arr){
        String str = "";
        for(double x:arr){
            str += x + " ";
        }
        return str;
    }
    public static String printStandardWhile(String[] arr) {
        int a = 0;
        String str = "";
        while (a < arr.length) {
            str += arr[a] + " ";
            a++;
        }
        return str;
    }
    public static String printStandardWhile(int[] arr) {
        int a = 0;
        String str = "";
        while (a < arr.length) {
            str += arr[a] + " ";
            a++;
        }
        return str;
    }
    public static String printStandardWhile(double[] arr) {
        int a = 0;
        String str = "";
        while (a < arr.length) {
            str += arr[a] + " ";
            a++;
        }
        return str;
    }
}
