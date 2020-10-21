class TypeInt {
    int a = 1;
    short b = 2;
    byte c = 3;
    long d = 4;

    public void printf() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Main {
    public static void main(String[] args) {
        TypeInt asdf = new TypeInt();
        asdf.printf();
    }
}