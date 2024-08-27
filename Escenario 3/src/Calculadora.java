import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        System.out.println("Suma: " + (a + b));
        System.out.println("Diferencia: " + (a - b));
        System.out.println("Producto: " + (a * b));
        System.out.println("Coeciente: " + (a / b));
        System.out.println("Residuo: " + (a % b));
    }
}
