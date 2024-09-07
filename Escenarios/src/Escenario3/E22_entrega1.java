package Escenario3;
import java.util.Scanner;

/*Autores:
  Cristian Mauricio Ricardo Rojas

3. Conversión de medidas de longitud
Escriba un programa que pida al usuario el número de metros de un objeto, y muestre en
pantalla las conversiones de dicha cantidad a pies(ft), pulgadas(in) y centímetros(cm).*/

public class E22_entrega1 {
    public static void main(String[] args) {
        // Optenemos el valor ingresado por el usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una medida entera en metros(m): ");
        int ingresoMetros = entrada.nextInt();

        // LLamamos a calculoPies para realizar la conversion a pies.
        double pies = calculoPies(ingresoMetros);
        System.out.println("----------------------------------------------------");
        System.out.printf("La conversión de metros a pies(ft) es de: %.2f",pies);
        System.out.println(" ");

        // Llamamos a calculoPulgadas para realizar la conversion a pulgadas.
        double pulgadas = calculoPulgadas(ingresoMetros);
        System.out.printf("La conversión de metros a pulgadas(in) es de: %.2f",pulgadas);
        System.out.println(" ");

        // LLamamos a calculoCentimetros para realizar la conversión a centimentros.
        double centimetros = calculoCentimetros(ingresoMetros);
        System.out.printf("La conversión de metros a centimetros(cm) es de: %.2f",centimetros);
    }

    static double calculoPies (int ingresoMetros) {
        double ft = 0.3048; // valor de 1 ft en metros.
        return (ingresoMetros*ft);
    }

    static double calculoPulgadas (int ingresoMetros) {
        double in = 39.37; // valor de 1 in en metros.
        return (ingresoMetros*in);
    }

    static double calculoCentimetros (int ingresoMetros) {
        double cm = 100;
        return (ingresoMetros*cm);
    }
}
