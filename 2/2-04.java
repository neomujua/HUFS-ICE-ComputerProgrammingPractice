package conversion;

class ToYard {
    private double meter = 100.785;
    
    public double toYard(double yard) {
        return yard / meter;
    }
}

public class Main {
    public static void main(String[] args) {
        ToYard a = new ToYard();
        System.out.println(a.toYard(100.785));
    }
}