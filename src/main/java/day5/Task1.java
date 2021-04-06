package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2012);
        car1.setColor("Зеленый");
        car1.setModel("Рено");

        System.out.println("Год выпуска авто: " + car1.getYear());
        System.out.println("Цвет авто: " + car1.getColor());
        System.out.println("Модель авто: " + car1.getModel());
    }
}
