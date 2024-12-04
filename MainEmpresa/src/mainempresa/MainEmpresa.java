package mainempresa;
import java.util.Scanner;

public class MainEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp", "1234567890", "Avenida Central 123", "contacto@techcorp.com");
        Scanner scanner = new Scanner(System.in);
        
        //agregar empleados
        empresa.agregarEmpleados(new Empleado("Ana Lopez", "1701234567", 1200.50));
        empresa.agregarEmpleados(new Empleado("Carlos Perez", "0109876543", 1500.00));
        empresa.agregarEmpleados(new Empleado("Maria Torres", "0202345678", 1350.75));
        empresa.agregarEmpleados(new Empleado("Jose Romero", "0308765432", 1600.25));
        empresa.agregarEmpleados(new Empleado("Laura Castillo", "0404567890", 1400.60));
        empresa.agregarEmpleados(new Empleado("Luis Garcia", "0507654321", 1250.30));
        empresa.agregarEmpleados(new Empleado("Daniela Morales", "0609871234", 1800.80));
        empresa.agregarEmpleados(new Empleado("Andres Chavez", "0703456789", 1100.90));
        empresa.agregarEmpleados(new Empleado("Gabriela Jimenez", "0806543210", 1700.40));
        empresa.agregarEmpleados(new Empleado("Fernando Sanchez", "0908765432", 1450.20));

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Eliminar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cedula del empleado: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Salario del empleado: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    // Limpiar buffer

                    empresa.agregarEmpleados(new Empleado(nombre, cedula, salario));
                    break;

                case 2:
                    System.out.print("Ingrese criterio para eliminar (nombre, cedula o salario): ");
                    String eliminar = scanner.nextLine();
                    empresa.eliminarEmpleados(eliminar);
                    break;

                case 3:
                    empresa.mostrarEmpleados();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}