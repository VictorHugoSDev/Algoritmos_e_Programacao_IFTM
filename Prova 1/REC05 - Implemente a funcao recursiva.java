/******************************************************************************
Implemente uma função recursiva para a seguinte especificação:

          | m + 1 , se n =1
h(m, n) = | n + 1 , se m = 1
          | h(m, n - 1) + h(m - 1, n) se m > 1, n > 1

Faça um programa em Java que utilize a função recursiva criada.

obs.: a solução obrigatoriamente precisa ser recursiva.

Entrada
Dois valores inteiros m e n.

Saída
Imprimir o resultado conforme exemplo disponibilizado na tabela abaixo.
*******************************************************************************/
import java.util.Scanner;

public class Main
{   
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
	   	int resultado = h(m, n);
		
		System.out.printf("h(%d,%d) = %d\n", m,n,resultado);
	}
	
	public static int h(int m, int n){
	    if(n == 1){
	        return m + 1;
	    }
	    
	    if(m == 1){
	        return n + 1;
	    }
	    
	    return h(m, n - 1) + h(m - 1, n);
	}
}
