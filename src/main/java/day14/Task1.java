package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            if (array.length != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            } else {
                int sum = 0;
                for (String x : array) {
                    sum += Integer.parseInt(x);
                }
                System.out.println(sum);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
