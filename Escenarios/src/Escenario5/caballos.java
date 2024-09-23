import java.util.Scanner;

public class caballos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fila_cab, col_cab, fila_rey, col_rey;
        System.out.print("Introduzca la fila del caballo (1-8): ");
        fila_cab = sc.nextInt();

        System.out.print("Introduzca la columna del caballo (1-8): ");
        col_cab = sc.nextInt();
        // Pedir al usuario las posiciones del rey
        System.out.print("Introduzca la fila del rey (1-8): ");
        fila_rey = sc.nextInt();

        System.out.print("Introduzca la columna del rey (1-8): ");
        col_rey = sc.nextInt();

        // Verificar si el caballo ataca al rey
        boolean ataca = false;

        // Movimientos posibles de un caballo en el ajedrez
        int[] mov_fila = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] mov_col = {1, 2, 2, 1, -1, -2, -2, -1};

        // Recorrer los 8 movimientos posibles del caballo
        for (int i = 0; i < 8; i++) {
            int nueva_fila = fila_cab + mov_fila[i];
            int nueva_col = col_cab + mov_col[i];

            if (nueva_fila == fila_rey && nueva_col == col_rey) {
                ataca = true;
                //finalizar bucle con break;
                break;
            }
        }
        if (ataca) {
            System.out.println("El caballo ataca al rey");
        } else {
            System.out.println("El caballo no ataca al rey");
        }
        return;
    }
}