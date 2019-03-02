//Implement Factory Pattern to get the Polygon of different type.
interface Polygontype{
    void info();}
class Pentagon implements Polygontype{
    @Override
    public void info() {
        System.out.println("This is a Pentagon it has 5 sides ");
    }}
class Hexagon implements Polygontype{
    @Override
    public void info() {
        System.out.println("This is a Hexagon it has 6 sides ");
    }}
class Octagon implements Polygontype{
    @Override
    public void info() {
        System.out.println("This is a Octagon it has 8 sides ");
    }}
class Polygon{
    Polygontype polygontype;
    public Polygontype getPolygontype() {
        return polygontype;
    }
    public void setPolygontype(Polygontype polygontype) {
        this.polygontype = polygontype;
    }}
class PolygonFactory{
    static Polygon getPolygon(String type){
        Polygon polygon=new Polygon();
        switch (type){
            case "Pentagon":
                polygon.setPolygontype(new Pentagon());
                break;
            case "Hexagon":
                polygon.setPolygontype(new Hexagon());
            case "Octagon":
                polygon.setPolygontype(new Octagon());
        }
        return polygon;
    }
}
public class FactoryDesign {
    public static void main(String[] args) {
        PolygonFactory.getPolygon("Pentagon").getPolygontype().info();
    }
}
