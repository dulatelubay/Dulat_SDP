//Factory Method Pattern
public abstract class CoffeeProduct {
    protected String name; //Field for storing the name of the coffee
    //Method to get the name of the coffee
    public String getName() {
        return name;
    }
    //Overriding toString method,to return the name of coffee
    @Override
    public String toString() {
        return name;
    }
}
//Defines the specific type of coffee.As you see in class it is for Espresso
class Espresso extends CoffeeProduct {
    public Espresso() {
        name = "Espresso";
    }
}
//This also defines specific type of coffee,but for Cappuccino
class Cappuccino extends CoffeeProduct {
    public Cappuccino() {
        name = "Cappuccino";
    }
}
