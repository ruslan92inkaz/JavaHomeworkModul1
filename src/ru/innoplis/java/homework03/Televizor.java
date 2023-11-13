package ru.innoplis.java.homework03;

public class Televizor {
    private String model;   // модель ТВ
    private  int diagonal; // диагональ экрана
    private int resolution; // разрешение
    private String color;



    public Televizor() {

    }
    public Televizor(String model,
                     int diagonal,
                     int resolution,
                     String color) {

        this.model = model;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.color = color;

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return " телевизор: \n" +
                this.model + " - Модель \n" +
                this.diagonal + " - Диагональ \n" +
                this.resolution + " - Разрешение \n" +
                this.color + " - Цвет \n";
    }
}