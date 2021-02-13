package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Assignment 1.1
        forLoop();
        forEachLoop();
        While();
        doWhile();
        //Assignment 1.2
        assignment1_2();

    }

    public static void forLoop() {
        int[] numbers = {5, 3, 7, 6, 2, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void forEachLoop() {  // For Each Loop is the most convenient
        int[] numbers = {5, 3, 7, 6, 2, 8};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void While() {
        int[] numbers = {5, 3, 7, 6, 2, 8};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }

    public static void doWhile() {
        int[] numbers = {5, 3, 7, 6, 2, 8};
        int i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
    }

    public static void assignment1_2() {
        int[] newArray = {5, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        System.out.println("Negative numbers are:");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 0)
                System.out.println(newArray[i]);
        }
        int odd = 0;
        System.out.println("Odd numbers are:");
        for (int i : newArray) {
            if (i % 2 != 0) {
                System.out.println(i);
                odd++;
            }
        }
        System.out.println("There are " + odd + " odd numbers in the array");

        boolean theSameValue = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (newArray[i] == newArray[j]) {
                    theSameValue = true;
                }
            }
        }
        if (theSameValue) {
            System.out.println("The same values exist");
        } else {
            System.out.println("There are no same values");

        }
        for (int i = 1; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] == newArray[j])
                    System.out.println("Number with the same value is:" + newArray[i]);
            }
        }

        System.out.println("Each second element of the array is:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i + 1]);
            i++;

        }
        System.out.println("The average of the array is: ");
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        int averageValue = sum / newArray.length;
        System.out.println(averageValue);

        int belowAverage = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < averageValue) {
                belowAverage++;
            }
        }
        System.out.println("There are " + belowAverage + " elements smaller than average " + averageValue + ".");

    }
}













