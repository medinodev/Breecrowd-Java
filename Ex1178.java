import java.util.Scanner;

public class Ex1178 {
    static double[] numeros = new double[100];
    public static int iAux = 0;

    public static void decompor(double num) {
        if (iAux == 100) {
            return; // Se iAux atingir 100, pare a recursão.
        }

        numeros[iAux] = num; // Armazene o valor atual no array.
        System.out.printf("N[%d] = %.4f\n", iAux, numeros[iAux]); // Exiba o valor formatado.
        iAux++; // Avance para a próxima posição no array.

        decompor(num / 2); // Recursão com o próximo valor.
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double num = l.nextDouble(); // Leia o número inicial.
        decompor(num); // Comece a decomposição.
    }
}
