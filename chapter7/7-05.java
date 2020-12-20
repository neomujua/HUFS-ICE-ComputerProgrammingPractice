import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int dayOfWeekInMonth = now.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int weekOfMonth = now.get(Calendar.WEEK_OF_MONTH);
        int dayOfYear = now.get(Calendar.DAY_OF_YEAR);
        int weekOfYear = now.get(Calendar.WEEK_OF_YEAR);
        String yoil = yoil(now.get(Calendar.DAY_OF_WEEK));

        System.out.printf("오늘은 %d년 %d월 %d일 %s입니다.\n", now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE), yoil);
        System.out.printf("이 달의 %d번째 %s입니다.\n", dayOfWeekInMonth, yoil);
        System.out.printf("이 달의 %d째 주입니다.\n", weekOfMonth);
        System.out.printf("이 해의 %d일입니다.\n", dayOfYear);
        System.out.printf("이 해의 %d째주입니다.\n", weekOfYear);

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