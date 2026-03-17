interface Shape {
    void draw();
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square");
    }
}

class FactoryPattern {
    public static Shape getShape() {
        return new Square();
    }
}