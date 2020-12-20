class PrimeNumber03 implements Runnable{
    int n;

    public PrimeNumber03(int n) {
        this.n = n;
    }

    public void run() {
        int j = 0;
        for(int i=2; i<=this.n; i++) {
            for(j=2; j<i; j++) {
                if(i%j==0) {
                    break;
                }
            }
            if(i==j) {
                System.out.println(i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread(new PrimeNumber03(25), "소수 만드는 스레드");
        System.out.println(myThread.getName());
        myThread.start();
    }
}