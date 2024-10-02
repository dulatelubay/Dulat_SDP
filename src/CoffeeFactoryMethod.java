public abstract class CoffeeFactoryMethod {
    public abstract CoffeeProduct createCoffee();
}

class EspressoFactory extends CoffeeFactoryMethod {
    @Override
    public CoffeeProduct createCoffee() {
        return new Espresso();
    }
}

class CappuccinoFactory extends CoffeeFactoryMethod {
    @Override
    public CoffeeProduct createCoffee() {
        return new Cappuccino();
    }
}
