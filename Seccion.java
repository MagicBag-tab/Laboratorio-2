public class Seccion {
    String nombre;
    Double capacidad;
    Contenedor[][] contenedores;
    double pesot = 0;

    public Seccion(String nombre, Double capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenedores = new Contenedor[10][5];
    }

    public boolean agregarContenedor(Contenedor contenedor){
        if (pesot + contenedor.getPeso() > capacidad){
            return false;
        }
        for(int fila = 0; fila < contenedores.length; fila++){
            for(int columna = 0; columna <contenedores[fila].length; columna++){
                if (contenedores[fila][columna] == null){
                    contenedores[fila][columna] = contenedor;
                    pesot = pesot + contenedor.getPeso();
                    return true;
                }
            }
        }
        return false;
    }
    
    public void moverContenedor(){

    }
    public void verContenedoresSeccion(){

    }
    public void calcPesoTotal(){

    }
}
