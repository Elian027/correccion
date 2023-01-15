package codigo2;

public class Musica extends Album{
    private String nomCancion;
    private int numCanciones;
    public Musica (String nombreAl, int anioLanzamiento, String nomCancion, int numCanciones) {
        super(nombreAl, anioLanzamiento);
        setNomCancion (nomCancion);
        setNumCanciones (numCanciones);
    }
    public void setNomCancion (String nomCancion) {
        this.nomCancion = nomCancion;
    }
    public void setNumCanciones (int numCanciones) {
        this.numCanciones = numCanciones;
    }
    public void mostrarMusica() {
        super.mostrarMusica();
        System.out.println("Cancion: "+nomCancion);
        System.out.println("Numero de canciones: "+numCanciones);
    }
}
