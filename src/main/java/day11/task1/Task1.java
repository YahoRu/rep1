package day11.task1;

public class Task1 {

    static void businessProcess(Worker worker) {
        for (int i = 0; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        System.out.println(warehouse1.toString());

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(warehouse1.toString());

        courier1.bonus();
        picker1.bonus();

        System.out.println(picker1.toString() + '\n' + courier1.toString());

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        courier2.bonus();
        picker2.bonus();
    }
}
