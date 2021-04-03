package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mas = new int[12][8];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(51);
            }
        }
        int sravnenie = 0;
        int index =  0;
        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                sum = sum + mas[i][j];
            }
            if (sravnenie <= sum) {
                sravnenie = sum;
                index = i;
            }
        }

        System.out.println(index);
    }

}
