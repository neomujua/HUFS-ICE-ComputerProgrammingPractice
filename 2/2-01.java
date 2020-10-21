class HelloJava {
    public static String name = "Hello, Java Application!";
}

public class Main {
    public static void main(String[] args) {
        HelloJava me = new HelloJava();
        System.out.println(me.name);
    }
}