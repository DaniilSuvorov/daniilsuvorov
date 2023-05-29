package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        parseFileToObjList(file);
        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            String[] array = new String[2];
            while (scanner.hasNextLine()) {
                array = scanner.nextLine().split(" ");
                if (Integer.parseInt(array[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        people.clear();
                        break;
                    }
                } else {
                    Person person = new Person(array[0], Integer.parseInt(array[1]));
                    people.add(person);

                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return people;
    }
}
