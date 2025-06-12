package kata2registrodemascotas;

public class Mascota {

    // Atributos
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar la información de la mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para cumplir años (sumar 1 a la edad)
    public void cumplirAnios() {
        edad++;
    }
}