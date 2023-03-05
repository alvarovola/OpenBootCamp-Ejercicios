package SmartDevices;

public class ImpresionSmartDevices {
    public static void main(String[] args) {
        SmartDevice movil = new SmartDevice(64,"Samsung", "S9+", 2018, 250);
        System.out.println(movil);
        SmartDevice iphone = new SmartPhone(128, "Apple", "Iphone 11", 2020, 400, 627523265);
        System.out.println(iphone);
        SmartDevice appleWatch = new SmartWatch(32, "Apple", "Watch 10", 2018, 300, 15);
        System.out.println(appleWatch);

    }
}
