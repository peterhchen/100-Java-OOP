// super class
class superClass {
    int num = 20;
    public void display () {
        System.out.println ("Super-Class display");
    }
}

// sub Class extends sClass
public class SubClass extends superClass {
    int num = 10;
    public void display () {
        System.out.println ("Sub-Class display");
    }

    public void myMethod () {
        SubClass sub = new SubClass();
        sub.display ();

        super.display();

        System.out.println ("Sub-Class: " + sub.num);
        System.out.println ("Super-class: " + super.num);
    }

    public static void main (String[] args) {
        // SubClass
        SubClass obj = new SubClass ();
        obj.myMethod();
    }

}
