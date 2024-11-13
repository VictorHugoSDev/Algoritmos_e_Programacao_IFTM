/******************************************************************************
Faça um programa que receba como entrada duas Strings s1 e s2. 
O algoritmo deve imprimir a parte/substring da String s1 que começa com a primeira ocorrência de s2 ou toda a frase s1, 
caso s2 não exista em s1.

obs.:
1. Não considerar acentos.
2. A função substring tem duas implementações: substring(int, int) e substring(int).


Entrada
Duas Strins s1 e s2.

Saída
Imprimir a frase resultante conforme regra acima.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		
		int index = s1.indexOf(s2);
		
		if(index != -1){
		    System.out.println(s1.substring(index));
		}else{
		    System.out.println(s1);
		}
		
		scanner.close();
	}
}
