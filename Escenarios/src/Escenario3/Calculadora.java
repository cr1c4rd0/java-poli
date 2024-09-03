package Escenario3;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        System.out.println("Suma es: " + (a + b));
        System.out.println("Resta es: " + (a - b));
        System.out.println("Multiplicación es: " + (a * b));
        System.out.println("Division es: " + (a / b));
        System.out.println("Modulo es: " + (a % b));
    }
}
