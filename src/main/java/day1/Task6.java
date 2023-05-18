package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 3;
        int i = 1;
        int x = 0;
        while (i < 10) {
            x = i * k;
            System.out.printf("%d x %d = %d  %n", i, k, x);
            i++;
        }
    }
}
