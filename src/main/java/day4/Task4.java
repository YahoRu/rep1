package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] masiv = new int[100];
        Random random = new Random(10001);

        int sum3 = 0;
        int index1el = 0;

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt();
        }
        for (int i = 0; i < masiv.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += masiv[j];
            }
            if (sum3 < sum) {
                sum3 = sum;
                index1el = i;
            }
        }
        System.out.println(index1el);
        System.out.println(sum3);
    }
}
