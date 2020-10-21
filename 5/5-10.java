class Computer {
    public final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
    private String myType;
    private int myBit;

    public Computer(int index, int bit) {
        myType = osType[index];
        myBit = bit;
    }

    public void print() {
        System.out.printf("운영체제: %s, 메인메모리: %d\n", myType, myBit);
    }
}

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer(0, 16);
        Computer apple = new Computer(1, 32);
        Computer galaxy = new Computer(2, 16);
        pc.print();
        apple.print();
        galaxy.print();
    }
}