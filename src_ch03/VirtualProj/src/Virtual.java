// Virutal.java
public class Virtual {
    public static void main (String[] args) {
        Salary s = new Salary ("Peter Chen", "Sunnyvale, CA", 1, 100000);
        Employee e = new Salary ("Jasmine Chen", "San Jose", 5, 90000);
        System.out.println ("Call mailcheck");
        s.mailCheck();
        System.out.println ("Call mailCheck");
        e.mailCheck();
    }
}
