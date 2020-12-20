public class Main {
    public static int fac(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for(int i=0; i<arr.length; i++) {
            arr[i] = new int[i+1];
            for(int j=0; j<=i; j++) {
                arr[i][j] = fac(i)/(fac(j)*fac(i-j));
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}