package codigo2;

public class Album {
    private String nombreAl;
    private int anioLanzamiento;
    public Album (String nombreAl, int anioLanzamiento) {
        this.nombreAl = nombreAl;
        this.anioLanzamiento = anioLanzamiento;
    }
    public String getNombreAl () {
        return nombreAl;
    }
    public int getAnioLanzamiento () {
        return anioLanzamiento;
    }
    public void setNombreAl () {
        this.nombreAl = nombreAl;
    }
    public void setAnioLanzamiento () {
        this.anioLanzamiento = anioLanzamiento;
    }
    public void mostrarMusica() {
        System.out.println("Album: "+nombreAl);
        System.out.println("Año de lanzamiento: "+anioLanzamiento);
    }
}
