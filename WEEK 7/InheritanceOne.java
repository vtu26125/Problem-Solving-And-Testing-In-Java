class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}

class InheritanceOne {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.walk();
        b.fly();
    }
}