package com.company;

public class Main {

    public static void printAmerican(String day, int year, String month, int date) {
        System.out.println("American format:");
        System.out.println(day + ", " + month + date + ", " + year);
    }

    public static void printEuropean(String day, int year, String month, int date) {
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + year);
    }

    public static void main(String[] args) {

        String day = "Thursday";
        int date = 22;
        String month = "July ";
        int year = 2019;

        printAmerican(day, year, month, date);
        printEuropean(day, year, month, date);

    }
}
