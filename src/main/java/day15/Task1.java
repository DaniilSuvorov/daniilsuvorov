package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/main/resources/shoes.csv");
        file.getParentFile().mkdirs();
        File file1 = new File("src/main/resources/missing_shoes.txt");
        file1.getParentFile().mkdirs();


        try {
            Scanner scanner = new Scanner(file);
            PrintWriter printWriter = new PrintWriter(file1);
            String[] array = new String[3];
            String line = "";
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.length() - line.replace(";", "").length() != 2) {
                    throw new Exception();
                }
                array = line.split(";");
                if (Integer.parseInt(array[2]) == 0) {
                    printWriter.println(line.replace(";", ","));

                }
            }
            scanner.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");

        }
    }
}
