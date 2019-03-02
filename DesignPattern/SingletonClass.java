class ConnectionDemo{
    private String name;
    private static ConnectionDemo connectionDemo;
    private ConnectionDemo(String name){
        this.name=name;
    }
    static ConnectionDemo getInstance(String name ){
        if(connectionDemo==null)
            connectionDemo=new ConnectionDemo(name);
        return connectionDemo;
    }

    @Override
    public String toString() {
        return "ConnectionDemo{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        System.out.println(ConnectionDemo.getInstance("Vanshika").toString());
    }
}
