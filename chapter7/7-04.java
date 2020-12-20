import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yearInput = new Scanner(System.in);
        Scanner monthInput = new Scanner(System.in);
        Scanner dateInput = new Scanner(System.in);
        int year = yearInput.nextInt();
        int month = monthInput.nextInt() -1;
        int date = dateInput.nextInt();

        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(year, month, date);

        System.out.println(yoil(myCalendar.getTime().getDay()));
    }

    public static String yoil(int n){
        switch (n) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "idk";
        }
    }
}