package day5;


import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2012, "Черный", "Ямаха");

        System.out.println("Год выпуска авто: " + motorbike1.getYear());
        System.out.println("Цвет авто: " + motorbike1.getColor());
        System.out.println("Модель авто: " + motorbike1.getModel());
    }
}
