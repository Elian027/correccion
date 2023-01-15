package codigo1;

public class Videojuego extends GeneroJuego {
    private String nombreJuego;
    private int anioLanzamiento;
    public Videojuego (String nombre, String genero, String nombreJuego, int anioLanzamiento) {
        super(nombre, genero);
        setNombreJuego(nombreJuego);
        setAnioLanzamiento(anioLanzamiento);
    }
    public void setNombreJuego (String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
    public void setAnioLanzamiento (int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    public void mostrarJuegos () {
        super.mostrarJuegos();
        System.out.println("Nombre: "+nombreJuego);
        System.out.println("Año de lanzamiento: "+anioLanzamiento);
    }
}
