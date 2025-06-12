package kata1registrodeestudiantes;

public class Estudiante {

    // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    // Método para subir la calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) {
            calificacion = 10;
        }
    }

    // Método para bajar la calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear instancia del estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);

        // Mostrar información inicial
        System.out.println("Información inicial:");
        estudiante1.mostrarInfo();

        // Subir calificación
        estudiante1.subirCalificacion(2.0);
        System.out.println("\nDespués de subir calificación:");
        estudiante1.mostrarInfo();

        // Bajar calificación
        estudiante1.bajarCalificacion(5.0);
        System.out.println("\nDespués de bajar calificación:");
        estudiante1.mostrarInfo();
    }
}