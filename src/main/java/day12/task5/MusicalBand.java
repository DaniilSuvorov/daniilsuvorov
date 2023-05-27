package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicalBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicalBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicalBand mb1, MusicalBand mb2) {
        for (int i = 0; i < mb1.members.size(); i++) {
            mb2.members.add(mb1.members.get(i));
        }
        mb1.members = new ArrayList<>();
    }

    public void printMembers() {
        System.out.println(members);
    }
}

class MusicArtist{
    String name;
    int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
