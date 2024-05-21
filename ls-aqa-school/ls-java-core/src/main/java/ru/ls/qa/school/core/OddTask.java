package ru.ls.qa.school.core;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddTask {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        System.out.println(isOdd(number));

    }

    public static boolean isOdd (int num) {
        if (num % 2 != 0) { return true; }
        else { return false; }
    }
}
