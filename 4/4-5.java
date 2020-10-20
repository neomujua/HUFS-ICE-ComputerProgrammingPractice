public class Main {
    public static void main(String[] args) {
        int principalSum = 1000000;
        float rate = 0.045;
        for(int i=0; i<10; i++) {
            System.out.println(principalSum + principalSum*rate*i);
        }
    }
}