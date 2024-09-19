import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seccion sec1 = new Seccion("Productos Electrónicos", 200000.0);
        Seccion sec2 = new Seccion("Ropa", 150000.0);
        Seccion sec3 = new Seccion("Alimentos", 250000.0);
        Seccion sec4 = new Seccion("Maquinaria", 300000.0);

        System.out.println("MENU");
        System.out.println("1. Almacenar Contenedores \n" +
                        "2. Mostrar Información de los Contenedores \n" +
                        "3. Mover Contenedores \n" +
                        "4. Calcular el Peso Total por Sección \n" + 
                        "5. Salir.");
        System.out.println("Ingrese una opción");
        int op = scanner.nextInt();

        while (op != 5){

            switch (op) {
                case 1:
                    System.out.println("Almacenar Contenedores");
                    System.out.println("Seleccione una sección: \n" +
                    "1. Productos Electrónicos \n" +
                    "2. Ropa \n" +
                    "3. Alimentos \n" +
                    "4. Maquinaria \n");
                    int secc = scanner.nextInt();
                    System.out.println("Ingrese el ID del contenedor: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el producto: ");
                    String product = scanner.nextLine();
                    System.out.println("Ingrese el peso del contenedor: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese el destino del contenedor: ");
                    String destiny = scanner.nextLine();

                    Contenedor cont = new Contenedor(id, product, peso, destiny);

                    boolean confirm = false;

                    switch (secc) {
                        case 1:
                            System.out.println("Productos Electrónicos");
                            confirm = sec1.agregarContenedor(cont);
                            break;
                        case 2:
                            System.out.println("Ropa");
                            confirm = sec2.agregarContenedor(cont);
                            break;
                        case 3:
                            System.out.println("Alimentos");
                            confirm = sec3.agregarContenedor(cont);
                            break;
                        case 4:
                            System.out.println("Maquinaria");
                            confirm = sec4.agregarContenedor(cont);
                            break;
                        default:
                            System.out.println("Seleccione una seccion válida");
                            break;
                        }

                        if (confirm){
                            System.out.println("El contenedor fue agregado exitosamente");
                        }else{
                            System.out.println("El contenedor no fue agregado al exceder la capacidad del peso");
                        }
                    break;
                case 2:
                    System.out.println("Mostrar Información de los Contenedores");
                    System.out.println("Seleccione una sección: \n" +
                    "1. Productos Electrónicos \n" +
                    "2. Ropa \n" +
                    "3. Alimentos \n" +
                    "4. Maquinaria \n");
                    int secc2 = scanner.nextInt();
                    Seccion select = null;
                    switch (secc2) {
                        case 1:
                            select = sec1;
                            break;
                        case 2:
                            select = sec2;
                            break;
                        case 3:
                            select = sec3;
                            break;
                        case 4:
                            select = sec4;
                            break;
                        default:
                            System.out.println("Sección seleccionada no válida");
                            break;
                    }
                    if (select != null){
                        System.out.println("Los contenedores de la sección " + select.getNombre() + "son: ");
                        Contenedor [][] contenedores = select.verContenedoresSeccion();

                        boolean empty = true;
                        for(int fila = 0; fila < contenedores.length; fila ++){
                            for(int columna = 0; columna < contenedores[fila].length; columna ++){
                                if(contenedores[fila][columna] != null){
                                    System.out.println(contenedores[fila][columna].toString());
                                    empty = false;
                                }
                            }
                        }
                        if (empty) {
                            System.out.println("No hay contenedores en esta sección.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Mover Contenedores");
                    System.out.println("Seleccione una sección: \n" +
                    "1. Productos Electrónicos \n" +
                    "2. Ropa \n" +
                    "3. Alimentos \n" +
                    "4. Maquinaria \n");
                    int secc3 = scanner.nextInt();
                    System.out.println("Ingrese la fila actual del producto");
                    int filaA = scanner.nextInt();
                    System.out.println("Ingrese la columna actual del producto");
                    int columnaA = scanner.nextInt();
                    System.out.println("Ingrese la fila nueva al que desea mover el producto");
                    int filaN = scanner.nextInt();
                    System.out.println("Ingrese la columna nueva al que desea mover elproducto");
                    int columnaN = scanner.nextInt();

                    Seccion select2 = null;

                    switch (secc3) {
                        case 1:
                            select2 = sec1;
                            break;
                        case 2:
                            select2 = sec2;
                            break;
                        case 3:
                            select2 = sec3;
                            break;
                        case 4:
                            select2 = sec4;
                            break;
                        default:
                            System.out.println("Sección seleccionada no válida");
                            break;
                    }
                    if (select2 != null){
                        boolean move = select2.moverContenedor(filaA, columnaA, filaN, columnaN);
                        if (move){
                            System.out.println("El contenedor fue modificado de posición exitosamente");
                        } else {
                            System.out.println("El contenedor no pudo ser modificado de posición");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Calcular el Peso Total por Sección");
                    System.out.println("Seleccione una sección: \n" +
                    "1. Productos Electrónicos \n" +
                    "2. Ropa \n" +
                    "3. Alimentos \n" +
                    "4. Maquinaria \n");
                    int secc4 = scanner.nextInt();

                    switch (secc4) {
                        case 1:
                            System.out.println("El peso de la sección Productos Electrónicos es: " + sec1.calcPesoTotal());
                            break;
                        case 2:
                            System.out.println("El peso de la sección Ropa es: " + sec2.calcPesoTotal());
                            break;
                        case 3:
                            System.out.println("El peso de la sección Alimentos es: " + sec3.calcPesoTotal());
                            break;
                        case 4:
                            System.out.println("El peso de la sección Maquinaria es: " + sec4.calcPesoTotal());
                            break;
                        default:
                            System.out.println("Sección seleccionada no válida");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa... Feliz Día :D");
                    break;
                default:
                    System.out.println("Elija una opción válida");
                    break;
            }

            System.out.println("MENU");
            System.out.println("1. Almacenar Contenedores \n" +
                            "2. Mostrar Información de los Contenedores \n" +
                            "3. Mover Contenedores \n" +
                            "4. Calcular el Peso Total por Sección \n" + 
                            "5. Salir.");
            System.out.println("Ingrese una opción");
            op = scanner.nextInt();

        }
        scanner.close();

    }
}
