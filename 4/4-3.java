import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        int tmp = 0;
        do {
            tmp = tmp*10 + inputNumber%10;
            inputNumber/=10;
        } while(inputNumber != 0);
		System.out.print(tmp);
    }
}