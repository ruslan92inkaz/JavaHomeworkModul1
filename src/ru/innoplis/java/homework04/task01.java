package ru.innoplis.java.homework04;
import java.sql.SQLOutput;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        char [] keyb = {'q','w','e','r','t','y','u', 'i', 'o', 'p',
                'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        int index = 0;
        for (int i =0; i < keyb.length; i++) {
            if (keyb[i] == input) {
                index = i;
                break;
            }
        }
        char output;
        if (index==0) {
            output = keyb[keyb.length-1];
        } else {
            output=keyb[index-1];
        }
        System.out.println(output);




    }
}
