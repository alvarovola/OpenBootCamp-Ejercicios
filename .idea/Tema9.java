public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente ();
        cliente.nombre = "Alvaro";
        cliente.edad = 25;
        cliente.credito = 200;
        cliente.telefono = "627-11-44-55";
        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println("Credito:"+cliente.credito);
        //Ahora con la clase Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Diego";
        trabajador.salario = 1500;
        trabajador.edad = 21;
        trabajador.telefono = "635-55-44-85";
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println("Salario:"+trabajador.salario);
    }
    public static class Persona {
         int edad;
         String nombre;
         String telefono;
    }

    public static class Cliente extends Persona {
        int credito;
    }

    public static class Trabajador extends Persona {
        int salario;
    }

}
