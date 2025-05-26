package inheritance.shapes;

public class Square extends Rectangle {
    /*
    A subclass may want to change the behavior of a method that it inherited.
    The override annotation is not required, but is strongly encouraged, because it helps catch errors.
    To override a method: keep the same signature, but change the body of the method.
    */
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    /*
    Overloaded Methods: Methods within the same hierarchy that have the same name but with different signatures.
    To overload a method: keep the same name but change the signature of the method.
    */
    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
