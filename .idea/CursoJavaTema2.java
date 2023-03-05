package OpenBootCampCourse;

public class Iva {
    public static void main(String[] args) {
        System.out.println(precioConIva(35, 5) + "EUR");
    }
    public static double precioConIva (double precio, int ivaPorcentaje){
        double IVA = (precio * ivaPorcentaje) / 100;
        return precio + IVA;
    }
}
