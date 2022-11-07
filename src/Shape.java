public class Shape{
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("Object Shape is created");
        this.shapeName = "Undefined Shape";
    }

    public Shape (double radius){
        System.out.println("Object Circle si created");
        this.shapeName = "Circle";
    }

    public Shape (int edges, double edgeLength) {
        System.out.println("The square is created");
        this.numberOfEdges = edges;
        this.shapeName = "Square";
    }

    public Shape (int edges, double e1, double e2) {
        System.out.println("Rectangle is created");
        this.numberOfEdges = edges;
        this.shapeName = "Rectangle";
    }

    public Shape (int edges, double e1, double e2, double e3) {
        System.out.println("Triangle is created");
        this.numberOfEdges = edges;
        this.shapeName = "Triangle";
    }

     public void getShapeDetails(){
         System.out.println("ShapeName: " + this.shapeName + "," + this.numberOfEdges);
    }
}
