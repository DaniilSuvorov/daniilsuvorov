package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player(rand.nextInt(11)+ 90);
        Player player2 = new Player(rand.nextInt(11)+ 90);
        Player player3 = new Player(rand.nextInt(11)+ 90);
        Player player4 = new Player(rand.nextInt(11)+ 90);
        Player player5 = new Player(rand.nextInt(11)+ 90);
        Player player6 = new Player(rand.nextInt(11)+ 90);
        Player.info();
        while(player1.getStamina() > Player.MIN_STAMINA){
            player1.run();
        }
        Player.info();
    }
}
