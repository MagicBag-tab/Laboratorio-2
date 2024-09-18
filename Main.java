public class Main {
    public static void main(String[] args) {
        Seccion sec1 = new Seccion("Productos Electrónicos", 200000.0);
        Seccion sec2 = new Seccion("Ropa", 150000.0);
        Seccion sec3 = new Seccion("Alimentos", 250000.0);
        Seccion sec4 = new Seccion("Maquinaria", 300000.0);

        System.out.println("MENU");
        System.out.println("1. Almacenar Contenedores \n" +
                           "2. Mostrar Información de los Contenedores \n" +
                           "3. Mover Contenedores \n" +
                           "4. Calcular el Peso Total por Sección \n");
    }
}
