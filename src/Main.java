public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Singleton: CoffeeShop instance
        CoffeeShopSingleton coffeeShop = CoffeeShopSingleton.getInstance();

        // Factory Method: Create coffee (Cappuccino or Espresso)
        CoffeeFactoryMethod espressoFactory = new EspressoFactory();
        CoffeeProduct espresso = espressoFactory.createCoffee();

        // Abstract Factory: Create ingredients for Cappuccino
        CoffeeIngredientsFactory ingredientsFactory = new CappuccinoIngredientsFactory();
        MilkProduct milk = ingredientsFactory.createMilk();
        SyrupProduct syrup = ingredientsFactory.createSyrup();

        // Builder: Create custom CoffeeOrder
        CoffeeOrderBuilder builder = new CoffeeOrderBuilder();
        CoffeeOrderPrototype order = builder
                .selectCoffee(espresso)
                .addMilk(milk)
                .addSyrup(syrup)
                .build();

        coffeeShop.placeOrder(order);
        coffeeShop.serveOrder(order);

        // Prototype: Clone the order
        CoffeeOrderPrototype clonedOrder = order.clone();
        coffeeShop.placeOrder(clonedOrder);
        coffeeShop.serveOrder(clonedOrder);
    }
}
