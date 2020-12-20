import java.util.Exception;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("정수 두 개 입력: ");
        try {
            x = input.nextInt();
            y = input.nextInt();
            z = x * y;
            System.out.printf("%d * %d = %d %n", x,y,z);
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}