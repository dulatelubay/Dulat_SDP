public abstract class CoffeeProduct {
    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Espresso extends CoffeeProduct {
    public Espresso() {
        name = "Espresso";
    }
}

class Cappuccino extends CoffeeProduct {
    public Cappuccino() {
        name = "Cappuccino";
    }
}
