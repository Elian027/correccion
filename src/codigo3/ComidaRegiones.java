package codigo3;

public class ComidaRegiones extends ComidaEcuador {
    private double precio;
    public ComidaRegiones (String nombre, String ingredientePri, String ciudad, double precio) {
        super(nombre, ingredientePri, ciudad);
        setPrecio(precio);
    }
    public void setPrecio (double precio) {
        this.precio = precio;
    }
    public void imprimirComida() {
        super.imprimirComida();
        System.out.println("Precio: "+precio);
    }
}
