package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        if (s >= 1 && s <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (s >= 5 && s <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (s >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (s < 1) {
            System.out.println("Ошибка ввода");
        }
    }
}
