package kata3primerospasosenencapsulamiento;

public class Kata3 {
    public static void main(String[] args) {

        // Crear un objeto de la clase Libro
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        // Mostrar la información inicial
        System.out.println("Información inicial:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicación: " + libro.getAñoPublicacion());

        // Intentar modificar con un año inválido
        libro.setAñoPublicacion(1800);

        // Intentar modificar con un año válido
        libro.setAñoPublicacion(2000);

        // Mostrar la información actualizada
        System.out.println("\nInformación actualizada:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicación: " + libro.getAñoPublicacion());
    }
}
