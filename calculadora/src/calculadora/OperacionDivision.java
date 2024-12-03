package calculadora;

import java.util.Scanner;

public class OperacionDivision {
    
    int numero1;
    int numero2;
    
    public void solicitarDatos(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor de numero1: ");
        numero1=scanner.nextInt();
        
        System.out.println("Ingrese el valor de numero2: ");
        numero2=scanner.nextInt();
    
    }
    public int calcular(){
    return numero1/numero2;
    }
}
