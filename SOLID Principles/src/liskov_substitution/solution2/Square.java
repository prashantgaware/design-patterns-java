package liskov_substitution.solution2;

public class Square implements Shape {
    private int width;

    @Override
    public int getArea() {
        return  width * width;
    }

    public Square(int width) {
        this.width = width;
    }
}
