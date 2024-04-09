/* Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error". */

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro valor...");
        int valorA = leitura.nextInt();
        System.out.println("Digite o segundo valor...");
        int valorB = leitura.nextInt();

        int soma = valorA + valorB;

        System.out.println("X = " + soma);

    }
}
