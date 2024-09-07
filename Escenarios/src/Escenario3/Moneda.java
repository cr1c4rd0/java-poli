package Escenario3;
import java.util.Scanner;

/*
2. Conversión de moneda
Juan está planificando un viaje a un país extranjero y necesita calcular la cantidad de dinero
que tendrá en la moneda local en diferentes momentos del día debido a las fluctuaciones en el
tipo de cambio.

A. Escribe un métod en Java llamado "conversionA las8AM" que reciba como entrada la
   cantidad de dinero en moneda local (P), y retorne la cantidad de dinero en moneda local
   a las 8:00 a.m., antes de cualquier cambio en el tipo de cambio.

B. Escribe un métod en Java llamado "conversionAlMediodía" que reciba como entrada la
   cantidad de dinero en moneda local (P), y retorne la cantidad de dinero en moneda local
   al mediodía, después de aplicar una disminución del 10% en el tipo de cambio.

C. Escribe un programa principal en Java que solicite al usuario ingresar la cantidad de
   dinero en moneda local y luego muestre en pantalla la cantidad de dinero en moneda
   local a las 8:00 a.m. y al mediodía.

El programa debe utilizar los métodos creados en los literales A y B.
 */

public class Moneda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de dinero en moneda local: ");
        double monedaLocal = entrada.nextDouble();
        int horaInicial = 8;
        System.out.println("----------------------------------------------------");
        double medioDia = conversionAlMedioDia(monedaLocal);
        System.out.println("La cantidad de dinero en moneda local el medio día es: " + medioDia);
    }

    // Punto B
    static double conversionAlMedioDia(double monedaLocal){
        monedaLocal = monedaLocal - (monedaLocal * 0.10);
        return monedaLocal;
    }
}
