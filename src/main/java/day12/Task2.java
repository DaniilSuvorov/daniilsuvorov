package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {

    public static void setList(int startNumber, int endNumber, List<Integer> list) {
        for(int i = startNumber; i<=endNumber;i++){
            if(i % 2==0){
                list.add(i);
            }
        }
    }
        public static void main (String[]args){
            List<Integer> list = new ArrayList<>();
            setList(0,30,list);
            setList(300,350,list);
            System.out.println(list);

    }
}
