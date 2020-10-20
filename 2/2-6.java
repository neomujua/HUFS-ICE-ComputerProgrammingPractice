class ToCode {
    String a = "자";

    public void printf() {
        a = String.valueOf('\uc790');
        System.out.println(a);
    }
}

public class Main {
    public static void main(String args[]) {
        ToCode a = new ToCode();
        System.out.println(a.a);
        a.printf();
    }
}