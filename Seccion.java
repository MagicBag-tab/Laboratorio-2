import java.util.ArrayList;
import java.util.List;

public class Seccion {
    private String nombre;
    private Double capacidad;
    private List<Contenedor> contenedores;

    public Seccion(String nombre, Double capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenedores = new ArrayList<>();
    }
}
