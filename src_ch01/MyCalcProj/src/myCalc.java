class calc {
    int z;
    public void add (int x, int y) {
        z = x + y;
        System.out.println ("Sum: " + z);
    }
    public void sub (int x, int y) {
        z = x - y;
        System.out.println ("Difference: " + z);
    }

}

public class myCalc extends calc {

    public void mul (int x, int y) {
        int z = x * y;
        System.out.println ("Multiplication: " + z);
    }

    public static void main (String[] args) {
        int a = 20, b = 10;
        myCalc c = new myCalc ();
        c.add (a, b);
        c.sub (a, b);
        c.mul (a, b);
    }

}

