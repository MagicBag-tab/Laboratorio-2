public class Contenedor {
    int ID;
    String producto;
    Double peso;
    String destino;

    public Contenedor(int ID, String producto, Double peso, String destino){
        this.ID = ID;
        this.producto = producto;
        this.peso = peso;
        this.destino = destino;
    }

    public int getID(){
        return ID;
    }
    public String getProducto(){
        return producto;
    }
    public Double getPeso(){
        return peso;
    }
    public String getDestino(){
        return destino;
    }

    public String toString() {
        return "ID: " + ID + ", Producto: " + producto + ", Peso: " + peso + " kg, Destino: " + destino;
    }
}