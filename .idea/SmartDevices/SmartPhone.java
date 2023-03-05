package SmartDevices;

public class SmartPhone extends SmartDevice {
    int numeroTelefono;
    public SmartPhone(){}

    public SmartPhone(int memoriaGB, String marca, String modelo, int annoFabricacion, double precio, int numeroTelefono) {
        super(memoriaGB, marca, modelo, annoFabricacion, precio);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numeroTelefono=" + numeroTelefono +
                ", memoriaGB=" + memoriaGB +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", annoFabricacion=" + annoFabricacion +
                ", precio=" + precio +
                '}';
    }
}
