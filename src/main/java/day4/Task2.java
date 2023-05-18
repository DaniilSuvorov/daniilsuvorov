package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        int numbers = 0;
        int sum = 0;
        for (int x : array) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                sum += x;
                numbers++;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numbers);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);

    }
}

