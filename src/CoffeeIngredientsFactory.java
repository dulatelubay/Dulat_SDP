public interface CoffeeIngredientsFactory {
    MilkProduct createMilk();
    SyrupProduct createSyrup();
}

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
