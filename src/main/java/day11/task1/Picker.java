package day11.task1;

public class Picker implements Worker {

    Warehouse warehouse;
    private int salary = 0;
    private boolean isPayed = false;
    private int forCountPicked = 0;

    public Picker(Warehouse warehouse) {
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
        forCountPicked++;
        this.warehouse.setCountPickedOrders(forCountPicked);
        return this.salary += 80;
    }

    @Override
    public void bonus() {
        while (this.warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            break;
        }
        if (this.warehouse.getCountPickedOrders() >= 10000 && isPayed == false) {
            salary += 70000;
            isPayed = true;
            System.out.println("Бонус начислен.");
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        }
    }


}
