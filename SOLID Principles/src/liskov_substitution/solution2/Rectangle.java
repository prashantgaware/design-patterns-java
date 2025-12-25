package liskov_substitution.solution2;

public class Rectangle implements Shape {
    private int width;
    private int length;

    @Override
    public int getArea() {
        return  width * length;
    }

    public Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }
}
