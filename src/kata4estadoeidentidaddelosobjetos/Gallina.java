package kata4estadoeidentidaddelosobjetos;

public class Gallina {

    // Atributos
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
    }

    // Método para mostrar el estado actual de la gallina
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
