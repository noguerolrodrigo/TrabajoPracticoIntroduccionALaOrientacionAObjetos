package kata4estadoeidentidaddelosobjetos;

public class Kata4 {
    public static void main(String[] args) {

        // Crear dos gallinas diferentes
        Gallina gallina1 = new Gallina("GALLINA-001", 2);
        Gallina gallina2 = new Gallina("GALLINA-002", 1);

        // Hacer que cada gallina ponga huevos
        gallina1.ponerHuevo();
        gallina1.ponerHuevo(); // Esta pone 2 huevos
        gallina2.ponerHuevo(); // Esta pone 1 huevo

        // Hacer que cada gallina envejezca
        gallina1.envejecer();
        gallina2.envejecer();

        // Mostrar el estado actual de cada gallina
        System.out.println("Estado de la gallina 1:");
        gallina1.mostrarEstado();

        System.out.println("\nEstado de la gallina 2:");
        gallina2.mostrarEstado();
    }
}
