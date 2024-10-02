//Abstract Factory Pattern
public interface SyrupProduct {
    //Method to get the type of syrup
    String getSyrup();
}

//Class that implements the SyrupProduct interface
class VanillaSyrup implements SyrupProduct {
    //Method getSyrup to return the syrup type
    @Override
    public String getSyrup() {
        return "Vanilla syrup";
    }
}

//Class that implements the SyrupProduct interface
class CaramelSyrup implements SyrupProduct {
    //Method getSyrup to return the syrup type
    @Override
    public String getSyrup() {
        return "Caramel syrup";
    }
}
