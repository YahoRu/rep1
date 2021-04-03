package day1;

import java.sql.SQLOutput;

public class Task5 {
    public static void main(String[] args) {
        int i = 1980;
        for (int year = i; year <= 2020; year += 4) {
            System.out.println("Олимпиада " + year + " года");
        }
    }
}
