package kata5comportamientodelosobjetos;

public class Kata5 {
    public static void main(String[] args) {

        // Crear la nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Explorador-1", 50);

        // Intentar avanzar 60 unidades sin recargar (debe fallar)
        nave.avanzar(60);

        // Recargar 40 unidades
        nave.recargarCombustible(40);

        // Intentar avanzar 60 unidades nuevamente (ahora debe funcionar)
        nave.avanzar(60);

        // Mostrar el estado final
        nave.mostrarEstado();

        // --- Ejercicio adicional para reforzar ---

        System.out.println("\n--- Segundo intento de prueba ---");
        NaveEspacial otraNave = new NaveEspacial("Pionero-X", 30);

        otraNave.despegar();
        otraNave.avanzar(15);
        otraNave.recargarCombustible(90); // debería recargar sólo hasta el máximo
        otraNave.avanzar(50);
        otraNave.mostrarEstado();
    }
}

