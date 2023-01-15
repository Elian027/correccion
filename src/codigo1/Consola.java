package codigo1;

public class Consola {
    private String nombre;
    public Consola (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre () {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void mostrarJuegos () {
        System.out.println("Consola: "+nombre);
    }
}
