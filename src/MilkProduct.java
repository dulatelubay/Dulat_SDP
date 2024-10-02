//Abstract Factory Pattern
//Method to get milk
public interface MilkProduct {
    String getMilk();
}
//Class WholeMilk that implements MilkProduct method
class WholeMilk implements MilkProduct {
    //Implementation of method getMilk to return the type of the milk
    @Override
    public String getMilk() {
        return "Whole milk";
    }
}
//Class AlmondMilk that implements MilkProduct method
class AlmondMilk implements MilkProduct {
    //Implementation of method getMilk to return the type of the milk
    @Override
    public String getMilk() {
        return "Almond milk";
    }
}
