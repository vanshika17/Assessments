//Implement Abstract Factory Pattern to create cars of different categories from different countries.
enum CarType{
    MICRO,MINI,LUXURY
}
enum Countries{
    INDIA,USA,JAPAN
}
abstract class Car{
    CarType carType;
    Countries countries;

    public Car(CarType carType, Countries countries) {
        this.carType = carType;
        this.countries = countries;
    }
    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", countries=" + countries +
                '}';
    }
}
class Mini extends Car{

    public Mini( Countries countries) {
        super(CarType.MINI, countries);
    }

    @Override
    void construct() {
        System.out.println("Type is mini car");
    }
}
class Micro extends Car{

    public Micro( Countries countries) {
        super(CarType.MICRO, countries);
    }

    @Override
    void construct() {
        System.out.println("type is micro car");
    }
}
class Luxury extends Car{

    public Luxury( Countries countries) {
        super(CarType.LUXURY, countries);
    }

    @Override
    void construct() {
        System.out.println("type is luxury car");
    }
}
class India{
    static Car buildCar(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car=new Mini(Countries.INDIA);
                break;
            case MICRO:
                car=new Micro(Countries.INDIA);
                break;
            case LUXURY:
                car=new Luxury(Countries.INDIA);
                break;
        }
        return car;
    }
}
class USA{
    static Car buildCar(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car=new Mini(Countries.USA);
                break;
            case MICRO:
                car=new Micro(Countries.USA);
                break;
            case LUXURY:
                car=new Luxury(Countries.USA);
                break;
        }
        return car;
    }
}
class Japan{
    static Car buildCar(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car=new Mini(Countries.JAPAN);
                break;
            case MICRO:
                car=new Micro(Countries.JAPAN);
                break;
            case LUXURY:
                car=new Luxury(Countries.JAPAN);
                break;
        }
        return car;
    }
}
class CarFactory{
    static Car buildCar(CarType carType,Countries countries){
        Car car=null;
        switch (countries){
            case USA:
                car=India.buildCar(carType);
                break;
            case INDIA:
                car=India.buildCar(carType);
                break;
            case JAPAN:
                car=India.buildCar(carType);
                break;
        }
        return car;
    }
}
public class AbstactFactory {
    public static void main(String[] args) {
        CarFactory.buildCar(CarType.MICRO,Countries.INDIA).construct();
    }
}
