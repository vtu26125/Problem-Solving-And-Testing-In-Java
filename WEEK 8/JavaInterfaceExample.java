interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}