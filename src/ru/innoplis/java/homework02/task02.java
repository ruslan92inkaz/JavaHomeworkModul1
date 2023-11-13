package ru.innoplis.java.homework02;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        System.out.println("Сумма двух целых чисел: " + (a+b));
        System.out.println("Разница двух целых чисел: " + (a-b));
        System.out.println("Произведение из двух целых чисел: " + (a*b));
        System.out.println("Среднее из двух целых чисел: " + ((a+b))/2);

        System.out.println("Расстояние двух целых чисел: " + Math.abs(a-b));

        System.out.println("Максимальное целое число: " + (a > b ? a : b));

        System.out.println("Минимальное целое число: " + (a < b ? a : b));

    }


}
