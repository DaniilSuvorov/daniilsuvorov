package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Shaman shaman = new Shaman();
        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Paladin paladin = new Paladin();
        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        for(int i = 0; i < 5; i++){
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }

    }
}
