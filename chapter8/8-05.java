class PrimeNumber02 extends Thread {
    int n;

    public PrimeNumber02(int n, String name) {
        setName(name);
        this.n = n;
    }

    public void run() {
        System.out.println(getName()+":");
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
        PrimeNumber02 pn = new PrimeNumber02(20, "소수 만드는 스레드");
        pn.start();
    }
}