class Complex {
    private double a;
    private double b;

    public Complex() {

    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static Complex add(Complex c1, Complex c2) {
        Complex c3 = new Complex(c1.a+c2.a, c1.b+c2.b);
        return c3;
    }

    public static Complex sub(Complex c1, Complex c2) {
        Complex c3 = new Complex(c1.a-c2.a, c1.b-c2.b);
        return c3;
    }

    public double abs(Complex c1) {
        return Math.sqrt(c1.a*c1.a + c1.b*c1.b);
    }

    public void print() {
        System.out.printf("%d + %di", this.a, this.b);
    }
}

public class Main {
    public static void main(String[] args) {
        Complex x = new Complex(3.4, 4.5);
        Complex y = new Complex(5.2, -2.4);
        Complex addResult = new Complex();
        addResult = Complex.add(x, y);
    }
}