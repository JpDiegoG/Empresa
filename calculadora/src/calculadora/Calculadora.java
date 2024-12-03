package calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                OperacionSuma suma = new OperacionSuma();
                suma.solicitarDatos();
                System.out.println("El resultado de la suma es: " + suma.calcular());
                break;

            case 2:
                OperacionResta resta = new OperacionResta();
                resta.solicitarDatos();
                System.out.println("El resultado de la resta es: " + resta.calcular());
                break;
            case 3:
                OperacionMultiplicacion multiplicar = new OperacionMultiplicacion();
                multiplicar.solicitarDatos();
                System.out.println("El resultado de la multiplicacion es: " + multiplicar.calcular());
                break;
            case 4:
                OperacionDivision division=new OperacionDivision();
                division.solicitarDatos();
                System.out.println("El resultado de la division es: " + division.calcular());

            default:
                System.out.println("Opción no válida.");
        }

    }
    
}
