//Factory Method Pattern
public abstract class CoffeeFactoryMethod {
    public abstract CoffeeProduct createCoffee();
}
//This factory class creates an Espresso coffee
class EspressoFactory extends CoffeeFactoryMethod {
    //Method to return Espresso instance
    @Override
    public CoffeeProduct createCoffee() {
        return new Espresso();
    }
}
//This factory class creates a Cappuccino coffee
class CappuccinoFactory extends CoffeeFactoryMethod {
    //Method to return Cappuccino instance
    @Override
    public CoffeeProduct createCoffee() {
        return new Cappuccino();
    }
}
