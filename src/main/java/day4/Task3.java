package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [][] mat = new int[12][8];
        int sum = 0;
        int totalSum = 0;
        int [] Array  = new int[8];

        for(int i = 0; i<mat.length; i++) {
            for(int j = 0; j<mat[i].length; j++) {
                mat[i][j] = rand.nextInt(50);
            }
        }
        for (int [] x:mat) {
            for(int y: x){
                sum += y;
                if(sum >= totalSum) {
                    totalSum = sum;
                    Array = x;
                }
                sum = 0;
            }
        }
        for(int i = 0; i<mat.length; i++) {
            if(Arrays.equals(Array,mat[i])) {
                System.out.println(i);
            }
        }
    }
}

