package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание №1
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        //Задание №2
        for (int friday = 7; friday < 31; friday = friday + 7)
            System.out.print("\n Сегодня пятница " + friday + "-е число.Необходимо подготовить отчет.");
        //Задание №3
        int year = 1896;
        int year1 = year + 200;
        for (int y2 = 1896; y2 < year1; y2 = y2 + 79) {
            System.out.print(" \n " + y2);
        }
    }
}