import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int a = number/10000;
        number %= 10000;
        int b = number/1000; 
        number %= 1000;
        int c = number/100;
        number %= 100;
        int d = number/10;
        number %= 10;
        System.out.printf("%d만 %d천 %d백 %d십 %d입니다.", a, b, c, d);
    }
}