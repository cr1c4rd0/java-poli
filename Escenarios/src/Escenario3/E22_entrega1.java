import java.util.Scanner;

/*Autores:
    Andrea Gonzalez Jimenez
    Andres Soler Medina
    Cristian Mauricio Ricardo Rojas
    Cristhian Bustos Avendaño
    Deibi Reyes Guerrero  PENDIENTE DE PARTICIPACIÓN
*/

public class E22_entrega1 {
    public static void main(String[] args) {
        // Capturamos en variable la medida en metros ingresado por el usuario
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese medida de longitud positiva en metros: ");
        float a = entrada.nextFloat ();

        // Imprimimos y llamamos los metodos de conversion para mostrar los resultados
        System.out.println("Longitud en centimetros: " + metrosacentimetros(a) + " centimetros");
        System.out.println("Longitud en pies: " + metrosapies(a) + " pies");
        System.out.println("longitud en pulgadas: " + metrosapulgadas(a) + " pulgadas");
    }

    // Metodo de conversion de metros a centimetros, pies y pulgadas
    static float metrosacentimetros (float a)  {
        float centimetros = 100;
        float metroscentimetros = a * centimetros;
        return metroscentimetros;
    }

    // Metodo de conversion de metros a pies
    static double metrosapies (float a)  {
        double pies = 3.28084;
        double metrospies = a * pies;
        return metrospies;
    }

    // Metodo de conversion de metros a pulgadas
    static double metrosapulgadas (float a)  {
        double pulgadas =39.3701;
        double metrospulgadas = a * pulgadas;
        return metrospulgadas;
    }
}
