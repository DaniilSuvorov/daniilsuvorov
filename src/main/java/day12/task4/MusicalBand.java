package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicalBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicalBand(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
    public static void transferMembers(MusicalBand mb1, MusicalBand mb2){
        for(int i = 0; i<mb1.members.size(); i++){
            mb2.members.add(mb1.members.get(i));
        }
        mb1.members = new ArrayList<>();



    }
    public void printMembers(){
        System.out.println(members);
    }
}

