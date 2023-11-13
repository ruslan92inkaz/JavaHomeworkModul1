package ru.innoplis.java.homework04;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String se = sc.nextLine();
        int arrowCount = 0;

        for (int i = 0; i < se.length() - 4; i++) {
            String substring = se.substring(i, i + 5);
            if (substring.equals(">>-->") || substring.equals("<--<<")) {
                arrowCount++;
            }
        }
    }