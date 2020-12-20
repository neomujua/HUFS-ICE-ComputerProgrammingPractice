import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        double weight = input.nextDouble();

        if (weight <= (height - 100) * 0.9) {
            System.out.println("정상");
        } else {
            system.out.println("비만");
        }
    }
}