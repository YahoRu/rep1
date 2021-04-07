package day7;

public class Player {

    private int stamina;

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        while (countPlayers <6) {
            countPlayers++;
            break;
        }

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int run(){
        stamina--;
        if (stamina == 0){
            countPlayers--;
            return countPlayers;
        } else if(stamina < 0){
            stamina++;
            return stamina;
        } else return stamina;
    }

    public static void info() {

        switch (getCountPlayers()){
            case 6 :
                System.out.println("На поле нет свободных мест");
                break;
            case 5 :
                System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + " свободное место");
                break;
            case 4 :
                System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + " свободных места");
                break;
            case 3 :
                System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + " свободных места");
                break;
            case 2 :
                System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + " свободных места");
                break;
            case 1 :
                System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + " свободных мест");
                break;
            case 0 :
                System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + " свободных мест");
                break;
        }

    }
//        if (getCountPlayers() < 6) {
//            System.out.println("Команды неполные. На поле еще есть " + (6 - getCountPlayers()) + " свободных мест");
//        } else System.out.println("На поле нет свободных мест");
//    }

}



