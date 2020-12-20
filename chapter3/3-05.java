import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}