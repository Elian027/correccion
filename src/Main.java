import codigo1.*;
import codigo2.*;
import codigo3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List listaExamen1 = new ArrayList();
    static List listaExamen2 = new ArrayList();
    static List listaExamen3 = new ArrayList();
    public static void main(String[] args) {
        try {
            listaExamen3.add(new ComidaRegiones ("Hornado","Cerdo","Quito",4.50));
            listaExamen1.add (new Videojuego("Play Station 5", "Accion y Aventura",
                    "God of War Ragnarok",2022));
            listaExamen2.add (new Autor("El ruiseñor de America",1989,"Fatalidad",
                    13,"Julio Jaramillo"));
            mostrarVideojuegos((ArrayList) listaExamen1);
            mostrarMusica((ArrayList) listaExamen2);
            mostrarDatos((ArrayList) listaExamen3);
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
    private static void mostrarDatos(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Comida");
            ComidaRegiones com = (ComidaRegiones) lista.get(i);
            com.imprimirComida();
        }
    }
    private static void mostrarVideojuegos (ArrayList lista1) {
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println("Videojuego");
            Videojuego vj = (Videojuego) lista1.get(i);
            vj.mostrarJuegos();
            System.out.println();
        }
    }
    private static void mostrarMusica (ArrayList lista2) {
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println("Musica");
            Autor aut = (Autor) lista2.get(i);
            aut.mostrarMusica();
            System.out.println();
        }
    }
}