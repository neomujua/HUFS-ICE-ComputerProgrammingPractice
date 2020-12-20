import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        if (month >= 7) {
            System.out.println("하반기입니다.");
        } else {
            System.out.println("상반기입니다.");
        }
    }
}