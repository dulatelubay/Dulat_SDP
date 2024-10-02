public class CoffeeOrderBuilder {
    private CoffeeProduct coffee;
    private MilkProduct milk;
    private SyrupProduct syrup;

    public CoffeeOrderBuilder selectCoffee(CoffeeProduct coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeOrderBuilder addMilk(MilkProduct milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeOrderBuilder addSyrup(SyrupProduct syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeOrderPrototype build() {
        return new CoffeeOrderPrototype(coffee, milk, syrup);
    }
}
