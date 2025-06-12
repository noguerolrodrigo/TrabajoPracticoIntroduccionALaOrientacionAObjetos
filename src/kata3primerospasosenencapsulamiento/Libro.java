package kata3primerospasosenencapsulamiento;

import java.time.Year;

public class Libro {

    // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación
    public void setAñoPublicacion(int nuevoAño) {
        int añoActual = Year.now().getValue(); // Obtiene el año actual del sistema

        if (nuevoAño >= 1900 && nuevoAño <= añoActual) {
            this.añoPublicacion = nuevoAño;
        } else {
            System.out.println("Error: El año de publicación debe estar entre 1900 y " + añoActual);
        }
    }
}