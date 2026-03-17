class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("Dog");
    }
}