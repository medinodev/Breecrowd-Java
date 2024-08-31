import java.util.Scanner;

public class Ex1029 {

    public static int numInteracoes = 0;

    public static int fibonacci(int num){

        numInteracoes++;

            if(num <= 1){
                return num;
            }
            return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numCont = leitura.nextInt();

        for (int i = 0; i < numCont; i++){

            numInteracoes = 0;

            System.out.println("Digite um numero"); //tirar quando for para o beecrowd
            int num = leitura.nextInt();
            int resultado = fibonacci(num);

            System.out.println("fib(" + num + ")" + " = " + (numInteracoes - 1) + " calls = " + resultado);
        }
    }
}
