public class CoffeeOrderPrototype implements Cloneable {
    CoffeeProduct coffee;
    MilkProduct milk;
    SyrupProduct syrup;

    public CoffeeOrderPrototype(CoffeeProduct coffee, MilkProduct milk, SyrupProduct syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    @Override
    protected CoffeeOrderPrototype clone() throws CloneNotSupportedException {
        return (CoffeeOrderPrototype) super.clone();
    }

    @Override
    public String toString() {
        return "Coffee: " + coffee.getName() + ", Milk: " + milk.getMilk() + ", Syrup: " + syrup.getSyrup();
    }
}
