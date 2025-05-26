package inheritance.shapes;

public class InheritanceChecker {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculatePerimeter();
        rectangle.print();

        Square square = new Square();
        square.calculatePerimeter();
        square.print();
        square.print("square");
    }
}
