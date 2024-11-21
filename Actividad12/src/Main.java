import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion = 0;
        String nombre;
        String telefono;

        do{
            System.out.println("Menu");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4.Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("AGREGAR CONTACTO");
                    System.out.println("Ingresa nombre");
                    nombre = scanner.nextLine();
                    System.out.println("Ingresa telefono");
                    telefono = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre,telefono);
                    agenda.agregarContacto(contacto);
                    System.out.println("Contacto agregado exitosamente");
                    break;
                case 2:
                    System.out.println("Buscar contactos");
                    System.out.println("Ingresa el nombre del contacto");
                    nombre = scanner.nextLine();
                    Contacto contactoEncontrado = agenda.buscarContacto(nombre);
                    if(contactoEncontrado != null){
                        System.out.println("Contacto encontrado: " + contactoEncontrado);
                    }else {
                        System.out.println("No se encontro");
                    }
                    break;
                case 3:
                    System.out.println("Mostrar todos los contactos");
                    agenda.mostrarContacto();
                    break;
                default:
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        }while( opcion==1 || opcion == 2 || opcion==3);
        scanner.close();
    }
}