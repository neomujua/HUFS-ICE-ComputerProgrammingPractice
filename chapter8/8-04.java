class PrimeNumber01 extends Thread {
    int n;

    public PrimeNumber01(int n) {
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
        PrimeNumber01 pn = new PrimeNumber01(20);
        pn.start();
    }
}