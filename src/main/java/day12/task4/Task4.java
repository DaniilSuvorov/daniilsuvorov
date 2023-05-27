package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicalBand musicalBand1 = new MusicalBand("Король и шут", 1988);
        List<String> members = new ArrayList<>();
        members.add("Михаил Горшенев");
        members.add("Андрей Князев");
        musicalBand1.setMembers(members);
        MusicalBand musicalBand2 = new MusicalBand("Beatles", 1960);
        List<String> members1 = new ArrayList<>();
        members1.add("Пол Маккартни");
        members1.add("Джон Леннон");
        musicalBand2.setMembers(members1);
        MusicalBand.transferMembers(musicalBand1,musicalBand2);
        musicalBand1.printMembers();
        musicalBand2.printMembers();
    }
}
