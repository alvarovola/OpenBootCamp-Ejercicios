package SmartDevices;

public class SmartDevice {
    int memoriaGB;
    String marca;
    String modelo;
    int annoFabricacion;
    double precio;
    public SmartDevice(){}

    public SmartDevice(int memoriaGB, String marca, String modelo, int annoFabricacion, double precio) {
        this.memoriaGB = memoriaGB;
        this.marca = marca;
        this.modelo = modelo;
        this.annoFabricacion = annoFabricacion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "memoriaGB=" + memoriaGB +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", annoFabricacion=" + annoFabricacion +
                ", precio=" + precio +
                '}';
    }
}
