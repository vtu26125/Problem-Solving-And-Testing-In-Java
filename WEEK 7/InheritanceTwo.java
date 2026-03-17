class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {}

class InheritanceTwo {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println(a.add(10, 20));
    }
}