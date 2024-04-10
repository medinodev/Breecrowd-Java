/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π. */

import java.util.Scanner;
public class Ex1002 {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        //System.out.println("Digite o valor do raio");
        double valorRaio = leitura.nextDouble();

        double valorPi = 3.14159;

        double calculoArea = valorPi * (valorRaio * valorRaio);

        System.out.println(String.format("A=%.4f", calculoArea));

        System.out.println("jjjjj");

        System.out.println("wqwqfyfyfyw");

    }

}
