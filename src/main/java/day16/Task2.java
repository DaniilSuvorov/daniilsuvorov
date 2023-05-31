package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String [] array = scanner.nextLine().split(" ");
            double sum = 0;
            for(int i =  0; i<array.length; i++){
                sum += Double.parseDouble(array[i]);
            }

            System.out.println((int)sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
    public static void main(String[] args) {
        try {
            Random rand = new Random();

            File file = new File("file1.txt");
            PrintWriter writer = new PrintWriter(file);
            for (int i = 0; i < 1000; i++) {
                writer.print(rand.nextInt(101) + " ");
            }
            writer.close();

            Scanner scanner = new Scanner(file);
            File file1 = new File("file2.txt");
            PrintWriter writer2 = new PrintWriter(file1);
            String[] array = scanner.nextLine().split(" ");
            scanner.close();
            double sum;
            for (int i = 0; i < array.length; i += 20) {
                sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += Integer.parseInt(array[j]);
                }
                writer2.print(sum / 20 + " ");
            }
            writer2.close();

        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
