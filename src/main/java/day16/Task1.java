package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String [] numbers = line.split(" ");
            double sum = 0;
            for (int i = 0; i<numbers.length;i++){
                sum += Integer.parseInt(numbers[i]);
            }
            double x = sum / numbers.length;
            System.out.println(x);
            System.out.printf("%.3f", x);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    public static void main(String[] args) {
        File file = new File("test");
        printResult(file);


    }
}

