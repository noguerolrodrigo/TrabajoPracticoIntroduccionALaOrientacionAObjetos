package kata2registrodemascotas;

public class Kata2 {
    public static void main(String[] args) {
        // Crear una instancia de Mascota
        Mascota miMascota = new Mascota("Firulais", "Perro", 3);

        // Mostrar información inicial
        System.out.println("Información inicial:");
        miMascota.mostrarInfo();

        // Cumplir años
        miMascota.cumplirAnios();

        // Mostrar información actualizada
        System.out.println("\nInformación después de cumplir años:");
        miMascota.mostrarInfo();
    }
}