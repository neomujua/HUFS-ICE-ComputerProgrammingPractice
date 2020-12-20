import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        int a = money / 50000;
        money %= 50000;
        int b = money / 10000;
        money %= 10000;
        int c = money / 5000;
        money %= 5000;
        int d = money / 1000;
        money %= 1000;
        System.out.printf("50000원권 %d개, 10000원권 %d개, 5000원권 %d개, 1000원권 %d개", a,b,c,d);
    }
}