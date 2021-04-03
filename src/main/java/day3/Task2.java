package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double delimoe = scanner.nextDouble();
        double delitel = scanner.nextDouble();
        double y;
        while(delitel != 0){
            y = delimoe / delitel;
            System.out.println(y);
            delimoe = scanner.nextDouble();
            delitel = scanner.nextDouble();
            if (delitel == 0)
                break;
        }
        }
    }
