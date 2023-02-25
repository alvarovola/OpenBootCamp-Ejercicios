public class Main {
    public static void main(String[] args) {
        int result = suma (10, 50, 10);
        System.out.println(result);

        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    static class Coche {
        public int puertas = 3;
        public void masPuertas(){
            this.puertas++;
        }
    }
}
