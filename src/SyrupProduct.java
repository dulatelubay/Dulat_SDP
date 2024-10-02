public interface SyrupProduct {
    String getSyrup();
}

class VanillaSyrup implements SyrupProduct {
    @Override
    public String getSyrup() {
        return "Vanilla syrup";
    }
}

class CaramelSyrup implements SyrupProduct {
    @Override
    public String getSyrup() {
        return "Caramel syrup";
    }
}
