class Animal {
    public void move () {
        System.out.println ("Animal move");
    }
}

class Dog extends Animal {
    public void move () {
        System.out.println ("Dogs can walk and run");
    }
}

public class Override01 {
    public static void main (String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
    }
}
