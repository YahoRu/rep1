package day7;

public class Airplane {

    public Airplane(String producer, int year, int length, int weight) {

        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        int b = airplane1.length - airplane2.length;
        if (b > 0) {
            System.out.println("Первый самолет длиннее");
        } else if (b == 0) {
            System.out.println("Длины самолетов равны");
        } else System.out.println("Второй самолет длиннее");

    }

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel(int fuel) {
        return this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длинна: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int n) {
        this.fuel = this.fuel + n;
        return this.fuel;
    }
}

