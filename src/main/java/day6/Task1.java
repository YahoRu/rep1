package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike motorbike1 = new Motorbike(2019, "Черный", "Ямаха");
        car1.yearDifference(2020);
        motorbike1.yearDifference(2020);
        car1.setYear(2014);
        car1.setColor("Зеленый");
        car1.setModel("Рено");

        car1.info();
        System.out.println(car1.yearDifference(2020));

        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2020));
    }
}
