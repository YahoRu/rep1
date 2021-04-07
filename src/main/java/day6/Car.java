package day6;


public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int yearOfProduction) {
        year = yearOfProduction;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String ColorCar) {
        color = ColorCar;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String ModelCar) {
        model = ModelCar;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

}

