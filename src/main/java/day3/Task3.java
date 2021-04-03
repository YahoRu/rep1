package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;
        int i = 0;
        while ( i < 5 )  {
            double delimoe = scanner.nextDouble();
            double delitel = scanner.nextDouble();

            i++;

            if (delitel == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            y = delimoe / delitel;
            System.out.println(y);
            }
        }
    }
