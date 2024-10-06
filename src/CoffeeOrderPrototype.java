//Prototype Pattern
//Class CoffeeOrderPrototype that implements the Cloneable interface to support cloning.
public class CoffeeOrderPrototype implements Cloneable {
    CoffeeProduct coffee; //Coffee product
    MilkProduct milk;     //Milk product
    SyrupProduct syrup;   //Syrup product
    //Constructor for the class that takes coffee, milk, and syrup products as parameters.
    public CoffeeOrderPrototype(CoffeeProduct coffee, MilkProduct milk, SyrupProduct syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }
    //Cloning method to create a new instance of CoffeeOrderPrototype.
    @Override
    protected CoffeeOrderPrototype clone() throws CloneNotSupportedException {
        return (CoffeeOrderPrototype) super.clone();
    }
    //toString method for outputting information about the coffee order.
    @Override
    public String toString() {
        return "Coffee: " + coffee.getName() + ", Milk: " + milk.getMilk() + ", Syrup: " + syrup.getSyrup();
    }
}
