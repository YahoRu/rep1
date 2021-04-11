package day11.task1;

public class Courier implements Worker {

    Warehouse warehouse;
    private int salary = 0;
    private boolean isPayed;
    private int forCountDelivered = 0;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "Заработал: " + getSalary() + " ; " + "Бонус: " + getIsPayed() + ";";
    }

    @Override
    public int doWork() {
        forCountDelivered++;
        this.warehouse.setCountDeliveredOrders(forCountDelivered);
        return this.salary += 100;
    }

    @Override
    public void bonus() {
        while (this.warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            break;
        }
        if (this.warehouse.getCountDeliveredOrders() >= 10000 && isPayed == false) {
            salary += 50000;
            isPayed = true;
            System.out.println("Бонус начислен.");
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}


