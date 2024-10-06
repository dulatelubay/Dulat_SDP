//Abstract Factory Pattern
//Interfac
public interface CoffeeIngredientsFactory {
    MilkProduct createMilk();//Method that creates milk product
    SyrupProduct createSyrup();//Method that creates syrup product
}
//Factory for creating ingredients specifically for Cappuccino.
class CappuccinoIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public MilkProduct createMilk() {
        return new WholeMilk();
    }

    @Override
    public SyrupProduct createSyrup() {
        return new VanillaSyrup();
    }
}
//Factory for creating custom ingredients
class CustomIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public MilkProduct createMilk() {
        return new AlmondMilk();
    }

    @Override
    public SyrupProduct createSyrup() {
        return new CaramelSyrup();
    }
}
