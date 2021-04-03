package day4;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int q = 0; //Количестве чисел больше 8
        int w = 0; //Количестве чисел равных 1
        int e = 0; //Количестве четных чисел
        int r = 0; //Количестве нечетных чисел
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(11);
            System.out.print(mas[i] + " ");
        }
        for (int massive : mas) {

            sum = sum + massive;

            if (massive == 1) {
                w++;
                r++;
            } else if (massive > 8 && massive == 10) {
                q++;
                e++;
            } else if (massive > 8 && massive == 9) {
                q++;
                r++;
            } else if (massive == 2 || massive == 4) {
                e++;
            } else if (massive == 6 || massive == 8) {
                e++;
            } else if (massive == 10 || massive == 0) {
                e++;
            } else if (massive == 1 || massive == 3) {
                r++;
            } else if (massive == 5 || massive == 7) {
                r++;
            } else if (massive == 9) {
                r++;
            }
        }
        System.out.println();
        System.out.println("Длинна массива: " + n);
        System.out.println("Количество чисел больше 8: " + q);
        System.out.println("Количество чисел равных 1: " + w);
        System.out.println("Количество четных чисел: " + e);
        System.out.println("Количество нечетных чисел: " + r);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

