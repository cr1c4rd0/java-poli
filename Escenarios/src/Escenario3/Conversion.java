import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        System.out.println("BIENVENID@S.");
        System.out.println("Este es un programa para la conversión de de medidas de longitud.");
        System.out.println("El programa solo te mostrara la conversion de metros a pies, pulgadas y centimetros.");
        System.out.println("Por favor ingresa el numero de metros.");
        Scanner entrada = new Scanner(System.in);
        double metros;
        metros=entrada.nextDouble();
        System.out.println("LA CONVERSIÓN A PIES ES: " + (metros * 0.3048));
        System.out.println("LA CONVERSIÓN A PULGADAS ES: "+ (metros * 39.37));
        System.out.println("LA CONVERSIÓN A CENTIMETRES ES: "+(metros * 100));
        System.out.println();
        System.out.println("Espero te pueda ayudar nuevamente.");
    }
}