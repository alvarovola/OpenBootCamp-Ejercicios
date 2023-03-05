package SmartDevices;

public class SmartWatch extends SmartDevice{
    int wirstDiameter;
    public SmartWatch(){}

    public SmartWatch(int memoriaGB, String marca, String modelo, int annoFabricacion, double precio, int wirstDiameter) {
        super(memoriaGB, marca, modelo, annoFabricacion, precio);
        this.wirstDiameter = wirstDiameter;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "wirstDiameter=" + wirstDiameter +
                ", memoriaGB=" + memoriaGB +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", annoFabricacion=" + annoFabricacion +
                ", precio=" + precio +
                '}';
    }
}
