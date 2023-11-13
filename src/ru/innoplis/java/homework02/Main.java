package ru.innoplis.java.homework02;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // формула перевода градусов в Фарегнейт = (Цельсий  1.8) +32
        // Цельсий = (Фаренгейт - 32) / 1.8

        Scanner tem = new Scanner(System.in);
        Double x = tem.nextDouble();
        double faren = (x-32) / 1.8;
        System.out.println( x +" градусов по Фаренгейту равна "  + faren + " по Цельсию");
    }
}
