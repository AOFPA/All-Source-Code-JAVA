
abstract class Shape {

    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("วาดรูปสี่เหลี่ยม");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("วาดรูปวงกลม");
    }
}

public class Test_abstract {

    public static void main(String[] args) {
        Shape rec = new Rectangle();
        Shape cir = new Circle();
        rec.draw();
        cir.draw();
    }
}
