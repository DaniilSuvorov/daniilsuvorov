package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static List<MusicalBand> groupsAfter2000(List<MusicalBand> bands) {
        List<MusicalBand> groupsAfter2000 = new ArrayList<>();
        for (MusicalBand x : bands) {
            if (x.getYear() > 2000) {
                groupsAfter2000.add(x);
            }
        }
        return groupsAfter2000;
    }
    public static void main(String[] args) {
        MusicalBand musicalBand1 = new MusicalBand( "Король и шут", 1988);
        MusicalBand musicalBand2 = new MusicalBand("Мельница", 1999);
        MusicalBand musicalBand3 = new MusicalBand("Nirvana",1987);
        MusicalBand musicalBand4 = new MusicalBand("Radio чача", 2010);
        MusicalBand musicalBand5 = new MusicalBand("BRUTTO", 2014);
        MusicalBand musicalBand6 = new MusicalBand("The Beatles", 1960);
        MusicalBand musicalBand7 = new MusicalBand("Queen", 1970);
        MusicalBand musicalBand8 = new MusicalBand("Северный флот", 2013);
        MusicalBand musicalBand9 = new MusicalBand("КняZz", 2011);
        MusicalBand musicalBand10 = new MusicalBand("Ляпис Трубецкой",1990);
        List<MusicalBand> musicalBands = new ArrayList<>();
        musicalBands.add(musicalBand1);
        musicalBands.add(musicalBand2);
        musicalBands.add(musicalBand3);
        musicalBands.add(musicalBand4);
        musicalBands.add(musicalBand5);
        musicalBands.add(musicalBand6);
        musicalBands.add(musicalBand7);
        musicalBands.add(musicalBand8);
        musicalBands.add(musicalBand9);
        musicalBands.add(musicalBand10);
        Collections.shuffle(musicalBands);
        System.out.println(musicalBands);
        System.out.println(groupsAfter2000(musicalBands));



    }
}
