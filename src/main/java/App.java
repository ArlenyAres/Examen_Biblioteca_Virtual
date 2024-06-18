import java.util.Scanner;

public class App {

    static String ANSI_BLACK = "\u001B[30m";
    static String ANSI_RED = "\u001B[31m";
    static String ANSI_GREEN = "\u001B[32m";
    static String ANSI_YELLOW = "\u001B[33m";
    static String ANSI_BLUE = "\u001B[34m";
    static String ANSI_PURPLE = "\u001B[35m";
    static String ANSI_CYAN = "\u001B[36m";
    static String ANSI_WHITE = "\u001B[37m";
    static String ANSI_RESET = "\u001B[0m";

    Inventario inventario = new Inventario();
    static Scanner scanner = new Scanner(System.in);


    public void mostrarMenu(){
        int opcion;

        do {
            System.out.println(ANSI_GREEN + "----->Menu de opciones <-------" + ANSI_RESET);
            System.out.println("1. Crear nueva coleccion");
            System.out.println("2. Añadir libro a coleccion");
            System.out.println("3. Añadir recurso digital a coleccion");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.print(ANSI_YELLOW + "Seleccione una opcion: " + ANSI_RESET);

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearNuevaColeccion();
                    break;
                case 2:
                    añadirNuevoLibroAColeccion();
                    break;
                case 3:
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }



        public void crearNuevaColeccion(){
            System.out.println(ANSI_BLUE + "---->Creando una Nueva coleccion<----"+ ANSI_RESET);
            System.out.println(" Ingrese Nombre de la colleccion : ");
            String nombre = scanner.nextLine();
            System.out.println(" Ingrese el nivel de acceso de la coleccion: ");
            System.out.print("Ingrese el nivel de acceso ->>> PUBLICO, PRIVADO, RESTRINGIDO <<<--: ");
            String nivelAccesoStr = scanner.nextLine();
            NivelAcceso nivelAcceso = NivelAcceso.valueOf(nivelAccesoStr.toUpperCase());
            System.out.println(" Ingrese el Valor total de la collecion en € : ");
            double valorTotal = scanner.nextDouble();
            Coleccion coleccion = new Coleccion(nombre, nivelAcceso, valorTotal);
            System.out.println(ANSI_CYAN + "Colección creada con Exito!!!!." + ANSI_RESET);

            scanner.nextLine();


        }

        public void añadirNuevoLibroAColeccion(){

        }


    }

