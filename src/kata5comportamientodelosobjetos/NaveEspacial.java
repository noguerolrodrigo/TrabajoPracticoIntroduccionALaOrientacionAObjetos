package kata5comportamientodelosobjetos;

public class NaveEspacial {

    // Atributos
    private String nombre;
    private int combustible;
    private final int COMBUSTIBLE_MAXIMO = 100;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, COMBUSTIBLE_MAXIMO);
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad de recarga debe ser positiva.");
            return;
        }

        int combustibleAntes = combustible;
        combustible = Math.min(combustible + cantidad, COMBUSTIBLE_MAXIMO);
        System.out.println("Se recargaron " + (combustible - combustibleAntes) + " unidades. Combustible actual: " + combustible);
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible actual: " + combustible);
    }
}