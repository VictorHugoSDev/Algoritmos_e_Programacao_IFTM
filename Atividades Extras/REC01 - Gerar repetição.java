/*Fazer uma função recursiva que recebe um número original (t) e um número inteiro contendo a quantidade de repetições (n) e imprima (n) vezes o número (t) , separados por '-'. 
Caso a quantidade de repetições for igual a 0 imprime vazio "", caso for 1 imprime o conteúdo de t. 

Faça um programa em Java que utilize a função recursiva criada.
obs1.: a solução obrigatoriamente precisa ser recursiva.

Entrada
Os números inteiros t e n.

Saída
Imprimir o número (t) n vezes.*/
import java.util.Scanner;

public class Main
{   
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int t = scanner.nextInt();
	    int n = scanner.nextInt();
	    
	    imprimirRepeticao(t, n);

	    scanner.close();
		
	}
	
	static void imprimirRepeticao(int t, int n){
        
        if(n<=0){
            return;
        }
        if(n == 1){
            System.out.println(t);
            return;
        }
        
        System.out.printf("%d-", t);
        
        imprimirRepeticao(t, n-1);
	}
}
