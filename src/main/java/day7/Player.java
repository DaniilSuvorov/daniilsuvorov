package day7;

public class Player {
    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers<=6){
            countPlayers++;
        }
    }

    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static int countPlayers;

    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayers() {
        return countPlayers;
    }
    void run(){
        if (stamina > 0) {
            stamina--;
        }
        if(stamina == MIN_STAMINA){
            countPlayers--;
        }
    }
    static void info(){
        if (countPlayers<6){
            System.out.println("Команды не полные, на поле есть ещё "+ (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
