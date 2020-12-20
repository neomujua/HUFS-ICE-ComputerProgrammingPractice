public class Main {
    public static void main(String[] args) {
        int[] prime = new int[1001];
        int numberOfRow = 0;
        for(int i=2; i<1001; i++){
            prime[i] = 1;
        }
        for(int i=2;i*i<1001; i++)  {
            for(int j=i*i; j<1001; j+=i){
                prime[j] = 0;
            }
        }
        for(int i=0; i<1001; i++){
            if(numberOfRow==20){
                System.out.println();
                numberOfRow = 0;
            }
            if(prime[i] == 1) {
                ++numberOfRow;
                System.out.printf("%d ", i);
            }
        }
    }
}