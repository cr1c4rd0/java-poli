package Escenario7;

import java.util.Scanner;

public class E22_entrega3 {

    public static boolean esContrasenaSegura(String contrasena) {
        // Se verifica si la longitud de la contraseña es mayor o igual a 10
        if (contrasena.length() < 10) {
            return false;
        }

        // Inicializamos banderas
        boolean tieneLetra = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;

        // Convertimos la contraseña en un arreglo de caracteres
        char[] caracteres = contrasena.toCharArray();

        // Recorremos cada carácter de la contraseña
        for (char c : caracteres) {
            // Verificamos si es una letra (mayúscula o minúscula)
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                tieneLetra = true;
            }
            // Verificamos si es un dígito (0-9)
            else if (c >= '0' && c <= '9') {
                tieneDigito = true;
            }
            // Verificamos si es un símbolo
            else {
                tieneSimbolo = true;  // Si no es ni letra ni dígito, es un símbolo
            }
        }

        // Verificamos si cumple con los 3 criterios
        return tieneLetra && tieneDigito && tieneSimbolo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recomendaciones para el usuario sobre una contraseña segura
        System.out.println("Una contraseña se considera segura si su longitud es mayor o igual a 10, tiene al menos una \n" +
                "letra (A-Z, a-z), tiene al menos un dígito (0-9), y tiene al menos un símbolo diferente a \n" +
                "letras o dígitos.");
        // Pedir la contraseña al usuario
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar si la contraseña es segura
        if (esContrasenaSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura, genere una nuevamente.");
        }
        scanner.close();
    }
}