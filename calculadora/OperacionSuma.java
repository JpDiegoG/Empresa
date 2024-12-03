package calculadora;

import java.util.Scanner;


public class OperacionSuma {
    //declaro las variables 
    int numero1;
    int numero2;
    
    //realizar los procesos
    public void solicitarDatos(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Ingrese el valor de numero1: ");
    numero1=scanner.nextInt();
    
    System.out.println("Ingrese el valor de numero2: ");
    numero2=scanner.nextInt();
    
    }
    //pedimos que calcule la operacion
    public int calcular(){
    return numero1+numero2;
    
    }
}