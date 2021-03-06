package day8;

public class Airplane {

    public Airplane(String producer, int year, int length, int weight) {

        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
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

    @Override
    public String toString() {
        return "Изготовитель: " + producer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel;
    }
}

