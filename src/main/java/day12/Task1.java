package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Волга");
        cars.add("Ока");
        cars.add("Жигули");
        cars.add("Лада");
        cars.add("Рено");
        System.out.println(cars);
        cars.add(3,"Москвич");
        cars.remove(0);
        System.out.println(cars);

    }
}
