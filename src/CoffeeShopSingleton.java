//Singleton Pattern
//Class that represents a coffee shop, ensuring only one instance exists.
public class CoffeeShopSingleton {
    private static CoffeeShopSingleton instance;

    //Private constructor to prevent instantiation from outside
    private CoffeeShopSingleton() {}

    //Method to get the single instance of the coffee shop.
    public static CoffeeShopSingleton getInstance() {
        if (instance == null) {
            instance = new CoffeeShopSingleton();
        }
        return instance;
    }

    //Process of ordering coffee
    public void placeOrder(CoffeeOrderPrototype order) {
        System.out.println("Order accepted: " + order);
        prepareOrder(order);
    }

    //Process of making a coffee
    private void prepareOrder(CoffeeOrderPrototype order) {
        System.out.println("Preparing your coffee...");
        try {
            Thread.sleep(2000); //Simulation of time to prepare
            System.out.println("Adding: " + order.milk.getMilk()); //Adding milk
            Thread.sleep(1000); //Delay
            System.out.println("Adding: " + order.syrup.getSyrup()); //Adding syrup
            Thread.sleep(1000); //Delay
            System.out.println("Coffee " + order.coffee.getName() + " is ready!"); //Coffee is ready
        } catch (InterruptedException e) {
            System.out.println("Error while preparing coffee.");//Handle any interruptions
        }
    }

    //Giving the coffee
    public void serveOrder(CoffeeOrderPrototype order) {
        System.out.println("Your coffee is ready: " + order);
    }
}
