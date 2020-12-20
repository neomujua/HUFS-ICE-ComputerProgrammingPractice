public class Main {
    public static void main(String[] args) {
        for(int i=0; i<=7; i++) {
            int j;
            for(j=7-i; j>0; j--){
                System.out.print(" ");
            }
            for(j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.printf("0");
            for(j=1; j<=i; j++){
                 System.out.print(j);
            }
		    System.out.println();
        }
    }
}