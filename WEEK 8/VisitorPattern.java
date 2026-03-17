interface Element {
    void accept(Visitor v);
}

interface Visitor {
    void visit();
}

class VisitorPattern implements Element {
    public void accept(Visitor v) {
        v.visit();
    }
}