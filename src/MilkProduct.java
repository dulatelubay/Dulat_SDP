public interface MilkProduct {
    String getMilk();
}

class WholeMilk implements MilkProduct {
    @Override
    public String getMilk() {
        return "Whole milk";
    }
}

class AlmondMilk implements MilkProduct {
    @Override
    public String getMilk() {
        return "Almond milk";
    }
}
