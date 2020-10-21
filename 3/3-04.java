import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        double temperature, result = 0;
        choice = input.next().charAt(0);
        temperature = input.nextDouble();
        switch(choice){
            case 'c':
            case 'C':
                result = (5.0/9.0)*(temperature-32);
                break;
            case 'f':
            case 'F':
                result = (9.0/5.0)*temperature+32;
                break;
        }
        System.out.println(result);
    }
}