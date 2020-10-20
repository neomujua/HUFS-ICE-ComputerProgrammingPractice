public class Main {
    public static void main(String[] args) {
        for(int i=1, j=0; i<=100; i++) {
            if((i%2==0)||(i%3==0)||(i%5==0)||(i%7==0)){
            } else {
                System.out.printf("%d ", i);
                if (++j == 10) {
                    System.out.println();
                }
            }
        }
    }
}