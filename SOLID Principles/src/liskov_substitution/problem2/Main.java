package liskov_substitution.problem2;

public class Main {
    public static void main(String[] args) {
        Rectangle square = new Square(2, 4);
        System.out.println(square.getArea());
    }
}
