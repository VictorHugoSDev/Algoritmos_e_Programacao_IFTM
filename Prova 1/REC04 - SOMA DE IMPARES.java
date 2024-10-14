/******************************************************************************
Escreva uma função recursiva que retorne o somatório dos números impares de 1 até N. O valor de N será um valor entre 1 e 10000.

Faça um programa em Java que utilize a função recursiva criada.

obs.: a solução obrigatoriamente precisa ser recursiva.

Entrada
Um número inteiro N que indica a quantidade de números a serem analisados.

Saída
Imprimir os números impares conforme exemplo dado na tabela abaixo.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		int N = scanner.nextInt();
		
		if(N >= 1 && N <= 10000){
		    int soma = somarImpares(N);
		    System.out.println(" = " + soma);
		}else{
		    System.out.println("Não é um valor válido");
		}
	
		
	}
	
	public static int somarImpares(int N){
	    if(N < 1){
	        return 0;
	    }
	    
	    int soma = somarImpares(N - 1);
	    
	    if(N % 2 != 0){
            if(soma > 0){
            System.out.printf(" + ");
            }
             System.out.printf("%d", N);
             return soma + N;
        }
	    return soma;
	}
}
