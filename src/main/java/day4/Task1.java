package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int numberMoreThanEight = 0;
        int one = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }
        for (int x : array) {
            System.out.print(x + " ");
            if (x > 8) {
                numberMoreThanEight++;
            }
            if (x == 1) {
                one++;
            }
            if (x % 2 == 0) {
                evenNumber++;
            }
            if (x % 2 != 0) {
                oddNumber++;
            }
            sum += x;
        }
        System.out.println();
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + numberMoreThanEight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}

