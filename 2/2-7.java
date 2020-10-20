import java.util.*;

public class Main {
    public static void main(String[] args) {
        int weight;
        float height;
        Scanner input = new Scanner(System.in);

        weight = input.nextInt();
        height = input.nextFloat();

        System.out.println("몸무게 : " + weight + " 키 : " + height);
    }
}