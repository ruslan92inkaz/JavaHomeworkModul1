package ru.innoplis.java.homework03;


public class App {
    public static void main(String[] args) {

        Televizor model1 = new Televizor();
        model1.setModel("Samsung");
        model1.getModel();
        model1.setDiagonal(32);
        model1.setResolution(720);
        model1.setColor("grey");
        System.out.println(model1.getModel());
        System.out.println(model1.getDiagonal());
        System.out.println(model1.getResolution());



        Televizor model2 = new Televizor("LG", 56, 1080, "white");
        System.out.println(model1);
        System.out.println(model2);



    }
}
