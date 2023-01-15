package codigo1;

public class GeneroJuego extends Consola{
    private String genero;
    public GeneroJuego (String nombre, String genero) {
        super(nombre);
        setGenero(genero);
    }
    public void setGenero (String genero) {
        this.genero = genero;
    }
    public void mostrarJuegos () {
        super.mostrarJuegos();
        System.out.println("Genero: "+genero);
    }
}
