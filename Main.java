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
                           "4. Calcular el Peso Total por Sección \n");
        System.out.println("Ingrese una opción");
        int op = scanner.nextInt();

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
                scanner.nextLine();
                System.out.println("Ingrese el peso del contenedor: ");
                double peso = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Ingrese el destino del contenedor: ");
                String destiny = scanner.nextLine();
                scanner.nextLine();

                Contenedor cont = new Contenedor(id, product, peso, destiny);

                switch (secc) {
                    case 1:
                        System.out.println("Productos Electrónicos");
                        sec1.agregarContenedor(cont);
                        System.out.println("El contenedor fue agregado exitosamente");
                        break;
                    case 2:
                        System.out.println("Ropa");
                        sec2.agregarContenedor(cont);
                        System.out.println("El contenedor fue agregado exitosamente");
                        break;
                    case 3:
                        System.out.println("Alimentos");
                        sec3.agregarContenedor(cont);
                        System.out.println("El contenedor fue agregado exitosamente");
                        break;
                    case 4:
                        System.out.println("Maquinaria");
                        sec4.agregarContenedor(cont);
                        System.out.println("El contenedor fue agregado exitosamente");
                        break;
                    default:
                        System.out.println("Seleccione una seccion válida");
                        break;
                }
                break;
            case 2:
                System.out.println("Mostrar Información de los Contenedores");
                break;

            case 3:
                System.out.println("Mover Contenedores");
                break;

            case 4:
                System.out.println("Calcular el Peso Total por Sección");
                break;
        
            default:
                System.out.println("Elija una opción válida");
                break;
        }

        scanner.close();

    }
}
