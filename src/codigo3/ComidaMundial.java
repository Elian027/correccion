package codigo3;

public class ComidaMundial {
    private String nombre;
    private String ingredientePri;
    public ComidaMundial (String nombre, String ingredientePri) {
        this.nombre = nombre;
        this.ingredientePri = ingredientePri;
    }
    public String getNombre () {
        return nombre;
    }
    public String getIngredientePri () {
        return ingredientePri;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setIngredientePri (String ingredientePri) {
        this.ingredientePri = ingredientePri;
    }
    public void imprimirComida () {
        System.out.println("Nombre: "+nombre);
        System.out.println("Ingrediente principal: "+ingredientePri);
    }
}
