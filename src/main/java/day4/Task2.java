package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        int i;
        int z = 10000; // самое большое число
        int t = 0; // самое маленькое число
        Random random = new Random();
        for (i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10001);
        }
        for (int number : mas) {
            if (t < number) {
                t = number;
            } else if (z > number) {
                z = number;
            } else
                continue;
        }
        System.out.println("Наибольший элемент массива: " + t);
        System.out.println("Наименьший элемент массива: " + z);
        int v = 0; // количество элементов с окончанием 0
        int m = 0; // сумма элементов с окончанием 0
        for (int number : mas) {
            if (number % 10 == 0) {
                v++;
                m = m + number;
            }
        }
        System.out.println("Количесво элементов массива с окончанием 0: " + v);
        System.out.println("Сумма элементов массива с окончанием 0: " + m);
    }
}
