//Builder Pattern
// Class CoffeeOrderBuilder that facilitates the step-by-step construction of a coffee order.
public class CoffeeOrderBuilder {
    private CoffeeProduct coffee; //Field to hold the selected coffee product
    private MilkProduct milk;//Field to hold the selected milk product
    private SyrupProduct syrup;//Field to hold the selected syrup product

    // Method to select the coffee product, returns the builder for method chaining.
    public CoffeeOrderBuilder selectCoffee(CoffeeProduct coffee) {
        this.coffee = coffee;//Assign selected coffee
        return this;
    }

    // Method to add a milk product, returns the builder for method chaining.
    public CoffeeOrderBuilder addMilk(MilkProduct milk) {
        this.milk = milk;//Assign selected milk
        return this;
    }

    // Method to add a syrup product, returns the builder for method chaining.
    public CoffeeOrderBuilder addSyrup(SyrupProduct syrup) {
        this.syrup = syrup;//Assign selected syrup
        return this;
    }

    //Method to build and return a CoffeeOrderPrototype instance with the selected ingredients.
    public CoffeeOrderPrototype build() {
        return new CoffeeOrderPrototype(coffee, milk, syrup);
    }
}
