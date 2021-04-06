package day6;


public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Aerobus", 1990, 25, 2500);

        airplane.setYear(2012);
        airplane.setLength(40);
        airplane.fillUp(50);
        airplane.fillUp(20);

        airplane.info();

    }
}
