package liskov_substitution.solution2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle.getArea());

        Square square = new Square(5);
        System.out.println(square.getArea());
    }
}
