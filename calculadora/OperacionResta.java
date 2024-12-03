package calculadora;

import java.util.Scanner;

public class OperacionResta {
    
    //declaro variables
    int numero1;
    int numero2;
    
    //realizar el proceso
    public void solicitarDatos(){
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor de numero1: ");
        numero1=scanner.nextInt();
        
        System.out.println("Ingrese el valor de numero2: ");
        numero2=scanner.nextInt();
    
    
    }
    
    //pedimos calcular la operacion
    public int calcular(){
    return numero1-numero2;
    
    }
    
}
