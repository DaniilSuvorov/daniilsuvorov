package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicalBand musicalBand1 = new MusicalBand("Король и шут", 1988);
        List<MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("Михаил Горшенев", 39));
        members.add(new MusicArtist("Андрей Князев",50));
        musicalBand1.setMembers(members);
        MusicalBand musicalBand2 = new MusicalBand("Beatles", 1960);
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Пол Маккартни", 80));
        members1.add(new MusicArtist("Джон Леннон",40));
        musicalBand2.setMembers(members1);
        MusicalBand.transferMembers(musicalBand1,musicalBand2);
        musicalBand1.printMembers();
        musicalBand2.printMembers();

    }
}
