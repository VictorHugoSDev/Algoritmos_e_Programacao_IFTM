/******************************************************************************

Crie um programa em Java que utilize a classe ArrayList para manipular uma lista de números inteiros. 
O programa deve:
a) Solicitar ao usuário a digitação de um número inteiro n, que corresponde a quantidade de números a serem inseridos.
b) Solicitar ao usuário que insira os n números inteiros, adicionando-os a uma lista (ArrayList).
c) Exibir os números da lista na ordem em que foram inseridos.
d) Calcular e exibir a soma de todos os números da lista.
e) Encontrar e exibir o maior número da lista.
f) Remover todos os números ímpares da lista e exibir a lista final contendo apenas números pares.
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
        
        int qtde = scanner.nextInt();
        
        for(int i = 0; i < qtde; i++){
            numero = scanner.nextInt();
            numeros.add(numero);
            
            soma+=numero;
        }
        
        for(int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
        
        System.out.println();
        
        System.out.println(soma);
        
        int maior = numeros.get(0);
        
        for(int x: numeros){
            if(x > maior){
                maior = x;
            }
        }
        
        System.out.println(maior);
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) {
                numeros.remove(i);
                i--;
            }
        }
        
        for(int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }

        scanner.close();
        
    }
}
