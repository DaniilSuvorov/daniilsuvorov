package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("0");
        for (int i = 1; i <= 20000; i++) {
            sb.append(" + " + i);
        }
        System.out.println(sb);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
        long startTime1 = System.currentTimeMillis();
        String str = "0";
        for (int i = 1; i <= 20000; i++) {
            str = str + " + " + i;
        }
        System.out.println(str);
        long stopTime1 = System.currentTimeMillis();
        System.out.println(stopTime1 - startTime1);
    }
}
