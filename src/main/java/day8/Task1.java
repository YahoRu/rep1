package day8;

public class Task1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(start);
//
//        String number = " ";
//
//        for (int i = 0; i <= 20000; i++) {
//            number = number + i + " ";
//        }
//
//        System.out.println(number);

        StringBuilder sb = new StringBuilder(" ");

        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());

        long finish = System.currentTimeMillis();
        System.out.println(finish);
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
    }
}
