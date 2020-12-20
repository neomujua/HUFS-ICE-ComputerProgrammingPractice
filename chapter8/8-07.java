import java.util.Date;

class PrintTime implements Runnable {
    int count;
    String msg;

    public PrintTime(int count) {
        this.count = count;
    }
    public void run() {
        Date now = new Date();
        while (count>0){
            System.out.println("순위 : " + Thread.currentThread().getPriority() + now + Thread.currentThread().getName());
            count--;
        }        
    }
}


public class Main {
    public static void main(String[] args) {
        PrintTime p1 = new PrintTime(3);
        Thread th1 = new Thread(p1, "안녕하세요!");
        th1.setPriority(Thread.MAX_PRIORITY-1);
        th1.start();

        PrintTiem p2 = new PrintTime(6);
        Thread th2 = new Thread(p2, "반갑습니다.");
        th2.setPriority(Thread.NORM_PRIORITY-1);
        th2.start();
    }
}