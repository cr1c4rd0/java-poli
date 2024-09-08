package Escenario3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese medida de longitud en metros: ");
        float a = entrada.nextFloat ();
        if(a < 0) {
            System.out.println("ingrese valor positivo");
        } else {
            System.out.println("Longitud en centimetros: " + metrosacentimetros(a) + " centimetros");
            System.out.println("Longitud en pies: " + metrosapies(a) + " pies");
            System.out.println("longitud en pulgadas: " + metrosapulgadas(a) + " pulgadas");
        }
    }

    static float metrosacentimetros (float a)  {
        float centimetros = 100;
        float metroscentimetros = a * centimetros;
        return metroscentimetros;
    }

    static double metrosapies (float a)  {
        double pies = 3.28084;
        double metrospies = a * pies;
        return metrospies;
    }
    static double metrosapulgadas (float a)  {
        double pulgadas =39.3701;
        double metrospulgadas = a * pulgadas;
        return metrospulgadas;
    }
}