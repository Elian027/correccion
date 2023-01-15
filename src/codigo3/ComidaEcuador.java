package codigo3;

public class ComidaEcuador extends ComidaMundial {
    private String ciudad;
    public ComidaEcuador (String nombre, String ingredientePri, String ciudad) {
        super(nombre, ingredientePri);
        setCantidad(ciudad);
    }
    public void setCantidad (String ciudad) {
        this.ciudad = ciudad;
    }
    public void imprimirComida() {
        super.imprimirComida();
        System.out.println("Ciudad: "+ciudad);
    }
}
