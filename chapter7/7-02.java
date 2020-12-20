public class Main {
    public static void main(String[] args) {
        int a = 1;
        float b = 1;
        double c = 0.1;
        boolean d = true;
        byte e = 1;
        short f = 1;
        long g = 1;
        char h = 'a';
    
        Integer aa = new Integer(a);
        Float bb = new Float(b);
        Double cc = new Double(c);
        Boolean dd = new Boolean(d);
        Byte ee = new Byte(e);
        Short ff = new Short(f);
        Long gg = new Long(g);
        Character hh = new Character(h);
    
        System.out.printf("%d %f %f %b %d %d %d %c", aa, bb, cc, dd, ee ,ff, gg, hh);
    }
}