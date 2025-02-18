/******************************************************************************

Escreva um programa(método main) que recebe diversos números inteiros positivos. 
Todos os números deverão ser armazenados em um ArrayList tipado paraInteger. 
O programa deverá parar quando o número for negativo. 
Por fim, oprograma deverá imprimir a quantidade de números que foram fornecidos, bem
como a soma desses números.
(Obrigatório o uso de ArrayList)

*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        while (true) {
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            numeros.add(numero);
            soma += numero;
        }

        scanner.close();

        System.out.println(numeros.size());
        System.out.println("soma = " + soma);
    }
}
