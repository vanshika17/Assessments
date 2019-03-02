//Implement Decorator pattern to decorate the Pizza with toppings.
interface Pizza{
    String info();
}
class PizzaBase implements Pizza{
    String PizzaBaseType;

    public PizzaBase(String pizzaBaseType) {
        this.PizzaBaseType = pizzaBaseType;
    }

    public String getPizzaBaseType() {
        return PizzaBaseType;
    }

    public void setPizzaBaseType(String pizzaBaseType) {
        PizzaBaseType = pizzaBaseType;
    }

    @Override
    public String info() {
        return " Pizza Base type is :: "+PizzaBaseType;
    }
}
class Toppings implements Pizza{
    Pizza pizza;
    String toppings;

    public Toppings(Pizza pizza, String toppings) {
        this.pizza = pizza;
        this.toppings = toppings;
    }

    public Pizza getPizzaBase() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String info() {
        return "toppings are :: "+toppings +" , "+pizza.info();
    }
}
class CheesePrefrence implements Pizza {
    String cheesePrefrences;
    Pizza pizza;

    public CheesePrefrence(String cheesePrefrences, Pizza pizza) {
        this.cheesePrefrences = cheesePrefrences;
        this.pizza = pizza;
    }

    public String getCheesePrefrences() {
        return cheesePrefrences;
    }

    public void setCheesePrefrences(String cheesePrefrences) {
        this.cheesePrefrences = cheesePrefrences;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String info() {
        return "CHeese prefrences is ::"+cheesePrefrences +" , "+pizza.info();
    }
}
public class DecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza=new PizzaBase("thin Crust");
        Pizza toppings = new Toppings(pizza,"tomato and onion");
        Pizza cheesePrefrences= new CheesePrefrence("cheese burst",toppings);
        System.out.println(cheesePrefrences.info());
    }
}

