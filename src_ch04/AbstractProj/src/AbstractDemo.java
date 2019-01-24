public class AbstractDemo {
    public static void main (String[] args) {
        Salary s = new Salary ("Peter Chen", "Sunnyvale, CA", 2, 100000);
        Employee e = new Salary ("Jasmine Chen", "San Jose, CA", 3, 90000);

        System.out.println ("Salary reference");
        s.mailCheck();
        System.out.println ("Employee reference");
        e.mailCheck();
    }
}
