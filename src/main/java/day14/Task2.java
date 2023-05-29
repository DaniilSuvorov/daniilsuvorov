package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> al = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            String string = "";
            String[] array = new String[2];
            while (scanner.hasNextLine()) {
                array = scanner.nextLine().split(" ");
                if (Integer.parseInt(array[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный ввод");
                        al.clear();
                        break;
                    }
                } else {
                    string = array[0] + " " + array[1];
                    al.add(string);
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return al;
    }
}

