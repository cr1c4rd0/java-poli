package Escenario3;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();
        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);
        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

    static double calcularArea(double radio) {
        double area = radio * radio * Math.PI;
        return area;
    }

    static double calcularPerimetro(double radio) {
        double perimetro = radio * 2 * Math.PI;
        return perimetro;
    }
}
