public class CoffeeShopSingleton {
    private static CoffeeShopSingleton instance;

    private CoffeeShopSingleton() {}

    // Method to get the single instance of the coffee shop.
    public static CoffeeShopSingleton getInstance() {
        if (instance == null) {
            instance = new CoffeeShopSingleton();
        }
        return instance;
    }

    // Process of ordering coffee
    public void placeOrder(CoffeeOrderPrototype order) {
        System.out.println("Order accepted: " + order);
        prepareOrder(order);
    }

    // Process of making a coffee
    private void prepareOrder(CoffeeOrderPrototype order) {
        System.out.println("Preparing your coffee...");
        try {
            Thread.sleep(2000); // Симуляция времени приготовления
            System.out.println("Adding: " + order.milk.getMilk()); // Добавляем молоко
            Thread.sleep(1000); // Задержка
            System.out.println("Adding: " + order.syrup.getSyrup()); // Добавляем сироп
            Thread.sleep(1000); // Задержка
            System.out.println("Coffee " + order.coffee.getName() + " is ready!"); // Кофе готов
        } catch (InterruptedException e) {
            System.out.println("Error while preparing coffee.");
        }
    }

    // Giving the coffee
    public void serveOrder(CoffeeOrderPrototype order) {
        System.out.println("Your coffee is ready: " + order);
    }
}
