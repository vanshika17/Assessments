import javax.print.attribute.standard.Sides;

//Implement Bridge Design Pattern for Color and
// Shape such that Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.
//Interface
interface Color{
    void colorInfo();
}

//concrete implementation
class Pink implements Color{

    @Override
    public void colorInfo() {
        System.out.println("using color pink ");
    }
}
class Blue implements Color{

    @Override
    public void colorInfo() {
        System.out.println("using color Blue ");
    }
}
class Red implements Color{

    @Override
    public void colorInfo() {
        System.out.println("using color Red ");
    }
}
//Abstraction
abstract class Shape{
    Color color;
    String shapeType;

    public Shape(Color color, String shapeType) {
        this.color = color;
        this.shapeType = shapeType;
    }
}
//refined Abstraction
class Square extends Shape{
    int NoOfSides;

    @Override
    public String toString() {
        return "Square{" +
                "shapeType='" + shapeType + '\'' +
                ", NoOfSides=" + NoOfSides +
                '}';
    }

    public Square(Color color, int NoOfSides) {
        super(color, "Square");
        this.NoOfSides=NoOfSides;
    }

}
class Circle extends Shape{
    int NoOfSides;

    @Override
    public String toString() {
        return "Square{" +
                "shapeType='" + shapeType + '\'' +
                ", NoOfSides=" + NoOfSides +
                '}';
    }
    public Circle(Color color,int NoOfSides) {
        super(color, "Square");
        this.NoOfSides=NoOfSides;
    }
}
class Triangle extends Shape{
    int NoOfSides;

    @Override
    public String toString() {
        return "Square{" +
                "shapeType='" + shapeType + '\'' +
                ", NoOfSides=" + NoOfSides +
                '}';
    }
    public Triangle(Color color,int NoOfSides) {
        super(color, "Square");
        this.NoOfSides=NoOfSides;
    }
}
public class BridgePattern {
    public static void main(String[] args) {
        Shape shape1= new Triangle(new Pink(),3);
        Shape shape2= new Triangle(new Pink(),3);
        Shape shape3= new Triangle(new Pink(),3);
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());


    }
}
