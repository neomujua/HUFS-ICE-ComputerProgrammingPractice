import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        System.out.printf("      %d년 %d월 달력", year, month);
        System.out.println();
        System.out.println("    일 월 화 수 목 금 토    ");
        now.set(year, month-1, 1);
        int tmp = now.get(Calendar.DAY_OF_WEEK);
        for(int i=1; i<tmp; i++){
            System.out.print("    ");
        }
        for(int i=1; i<=now.getActualMaximum(Calendar.DATE); i++){
            System.out.printf("%2d  ", i);
            tmp++;
            if(tmp%7==1) {
                System.out.println();
            }
        }
    }
}