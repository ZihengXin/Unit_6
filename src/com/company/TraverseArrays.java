package com.company;
public class TraverseArrays {
    public static int countEven(int[] nums) {
        int even = 0;
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] % 2 == 0)
                even++;
        }
        return even;
    }
    public static int[] buildArray(int desiredLength) {
        int[] createdArray = new int[desiredLength];
        for (int num = 0; num < createdArray.length; num++)
            createdArray[num] = num;
        return createdArray;
    }
    public static boolean sum28(int[] numbers) {
        int two = 0;
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] == 2)
                two += 2;
        }
        return two == 8;
    }

    public static int[] zeroMax(int[] original) {
        for (int a = 1; a < original.length; a += 2) {
            if (original[a] % 2 != 0) {
                original[a - 1] = original[a];
            }
        }
        return original;
    }
    public static void main(String[] args) {
    }
}