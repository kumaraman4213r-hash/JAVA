class ShapeArea {
    public int area(int side) {
        return side * side;
    }

    public int area(int length, int width) {
        return length * width;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();

        System.out.println("Square area: " + shape.area(5));
        System.out.println("Rectangle area: " + shape.area(4, 6));
        System.out.println("Circle area: " + shape.area(3.0));
    }
}
