/*
En la clase de historia de Juan con frecuencia se habla de los siglos en que ocurrieron ciertos
hechos. Esto hace que a Juan se le dificulte un poco ubicar los hechos en una línea de tiempo.
Su tarea es escribir un programa java que ayude a Juan.

    A. Escriba un metodo java llamado siglo, el cual recibe como entrada el número de un año
       (positivo), y retorna el número del siglo al que pertenece el año.
    B. Escriba un metodo java llamado primer_anho, el cual recibe como entrada el número de
       un siglo (positivo), y retorna el número del primer año de dicho siglo.
    C. Complete el programa de forma que lea del teclado un valor n correspondiente a un año,
       e imprima en pantalla el número del siglo al que pertenece el año n y el primer año de
       dicho siglo.
El programa debe usar los métodos creados en los literales a y b.
*/
package Escenario3;
import java.util.Scanner;

public class Siglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de un año: ");
        int n = entrada.nextInt();
        int anio = calculoSiglo(n);
        if (anio == 0){
            System.out.println("El siglo que ingreso aún no existe");
        }
        else {
            String romano = conversionRomano(anio);
            System.out.println("El siglo al que pertenece el año es: "+ romano);
            int primerAnio = primer_anho(anio);
            System.out.println("El primer año del siglo "+romano+" es: " + primerAnio);
        }
    }

    // A. Calculamos el siglo según el valor ingresado
    static int calculoSiglo(int n) {
        int totalSiglo = 0;
        if (n <= 100) {
            totalSiglo = 1;
        } else if (n <= 200) {
            totalSiglo = 2;
        } else if (n <= 300) {
            totalSiglo = 3;
        } else if (n <= 400) {
            totalSiglo = 4;
        } else if (n <= 500) {
            totalSiglo = 5;
        } else if (n <= 600) {
            totalSiglo = 6;
        } else if (n <= 700) {
            totalSiglo = 7;
        } else if (n <= 800) {
            totalSiglo = 8;
        } else if (n <= 900) {
            totalSiglo = 9;
        } else if (n <= 1000) {
            totalSiglo = 10;
        } else if (n <= 1100) {
            totalSiglo = 11;
        } else if (n <= 1200) {
            totalSiglo = 12;
        } else if (n <= 1300) {
            totalSiglo = 13;
        } else if (n <= 1400) {
            totalSiglo = 14;
        } else if (n <= 1500) {
            totalSiglo = 15;
        } else if (n <= 1600) {
            totalSiglo = 16;
        } else if (n <= 1700) {
            totalSiglo = 17;
        } else if (n <= 1800) {
            totalSiglo = 18;
        } else if (n <= 1900) {
            totalSiglo = 19;
        } else if (n <= 2000) {
            totalSiglo = 20;
        } else if (n <= 2100) {
            totalSiglo = 21;
        }
        return totalSiglo;
    }

    // Converstimos el número del siglo a romanos
    static String conversionRomano (int totalSiglo){
        String numeroRomano = "";
            if (totalSiglo == 1) {
                numeroRomano = "I";
            } else if (totalSiglo == 2) {
                numeroRomano = "II";
            } else if (totalSiglo == 3) {
                numeroRomano = "III";
            } else if (totalSiglo == 4) {
                numeroRomano = "IV";
            } else if (totalSiglo == 5) {
                numeroRomano = "V";
            } else if (totalSiglo == 6) {
                numeroRomano = "VI";
            } else if (totalSiglo == 7) {
                numeroRomano = "VII";
            } else if (totalSiglo == 8) {
                numeroRomano = "VIII";
            } else if (totalSiglo == 9) {
                numeroRomano = "IX";
            } else if (totalSiglo == 10) {
                numeroRomano = "X";
            } else if (totalSiglo == 11) {
                numeroRomano = "XI";
            } else if (totalSiglo == 12) {
                numeroRomano = "XII";
            } else if (totalSiglo == 13) {
                numeroRomano = "XIII";
            } else if (totalSiglo == 14) {
                numeroRomano = "XIV";
            } else if (totalSiglo == 15) {
                numeroRomano = "XV";
            } else if (totalSiglo == 16) {
                numeroRomano = "XVI";
            } else if (totalSiglo == 17) {
                numeroRomano = "XVII";
            } else if (totalSiglo == 18) {
                numeroRomano = "XVIII";
            } else if (totalSiglo == 19) {
                numeroRomano = "XIX";
            } else if (totalSiglo == 20) {
                numeroRomano = "XX";
            } else if (totalSiglo == 21) {
                numeroRomano = "XXI";
            }
        return numeroRomano;
    }

    //B. Retorna el primer año del siglo ingresado
    static int primer_anho(int anio) {
        int primerAnio = 0;
        if (anio == 1) {
            primerAnio = 1;
        } else if (anio == 2) {
            primerAnio = 101;
        } else if (anio == 3) {
            primerAnio = 201;
        } else if (anio == 4) {
            primerAnio = 301;
        } else if (anio == 5) {
            primerAnio = 401;
        } else if (anio == 6) {
            primerAnio = 501;
        } else if (anio == 7) {
            primerAnio = 601;
        } else if (anio == 8) {
            primerAnio = 701;
        } else if (anio == 9) {
            primerAnio = 801;
        } else if (anio == 10) {
            primerAnio = 901;
        } else if (anio == 11) {
            primerAnio = 1001;
        } else if (anio == 12) {
            primerAnio = 1101;
        } else if (anio == 13) {
            primerAnio = 1201;
        } else if (anio == 14) {
            primerAnio = 1301;
        } else if (anio == 15) {
            primerAnio = 1401;
        } else if (anio == 16) {
            primerAnio = 1501;
        } else if (anio == 17) {
            primerAnio = 1601;
        } else if (anio == 18) {
            primerAnio = 1701;
        } else if (anio == 19) {
            primerAnio = 1801;
        } else if (anio == 20) {
            primerAnio = 1901;
        } else if (anio == 21) {
            primerAnio = 2001;
        }
        return primerAnio;
    }
}