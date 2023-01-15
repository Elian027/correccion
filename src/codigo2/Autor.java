package codigo2;

public class Autor extends Musica {
    private String autor;
    public Autor (String nombreAl, int anioLanzamiento, String nomCancion, int numCanciones, String autor) {
        super(nombreAl, anioLanzamiento, nomCancion, numCanciones);
        setAutor (autor);
    }
    public void setAutor (String autor) {
        this.autor = autor;
    }
    public void mostrarMusica() {
        super.mostrarMusica();
        System.out.println("Autor: "+autor);

    }
}
