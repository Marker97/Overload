public class Tester {
    public static void main(String[] args) {

        Shape undefined = new Shape();
        Shape circle = new Shape(2.0);
        Shape square = new Shape(2, 3.0);
        Shape rectangle = new Shape(2, 4.0,4.0);
        Shape triangle = new Shape(2, 5.0, 5.0, 5.0);

        undefined.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();

    }
}