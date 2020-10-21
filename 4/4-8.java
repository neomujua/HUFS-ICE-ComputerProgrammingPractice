public class Main {
    public static void main(String[] args) {
        int[][] arr = {{78,48,78, 98},{99,92},{29,64,83},{34,78,92,56}};
        int sum=0;
        int j=0;
        for(int i=0; i<arr.length; i++) {
            sum=0;
            j=0;
            for(int data: arr[i]){
                sum += data;
                j++;
            }
            System.out.printf("합 : %d\n", sum);
            System.out.printf("평균 : %d\n", sum/j);
        }
    }
}