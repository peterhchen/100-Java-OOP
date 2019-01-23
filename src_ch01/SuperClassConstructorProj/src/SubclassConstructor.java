class superClass {
    int age;
    superClass (int age) {
        this.age = age;
    }
    public void getAge () {
        System.out.println ("superClass age " + age);
    }
}

public class SubclassConstructor extends superClass {
    SubclassConstructor (int age) {
        super (age);
    }
    public static void main (String[] args) {
        SubclassConstructor s = new SubclassConstructor (24);
        s.getAge();
    }
}

