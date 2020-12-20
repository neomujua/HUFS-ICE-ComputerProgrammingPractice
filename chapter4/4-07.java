public class Main {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        boolean flag = true;
        while(flag){
            sum = 0;
            i++;
            for(int j=0; j<=i; j++){
                sum += j;
                if (sum>5000){
                    flag = false;
                    break;
                }
            }
        }
        System.out.printf("%d %d", sum-i , i-1);
    }
}