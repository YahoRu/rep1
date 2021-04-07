package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Aerobus", 1990, 110, 2500);
        Airplane airplane2 = new Airplane("Boieng", 2005, 120, 40000);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}