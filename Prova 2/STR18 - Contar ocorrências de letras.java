/******************************************************************************
Faça um programa em Java que recebe uma frase e duas letras e 
imprima a letra que tenha a maior quantidade de ocorrências na frase.
Caso, tenham a mesma quantidade de ocorrências, imprimir empate. 
Obs.: É case-sensitive, ou seja, letras maiúsculas são diferentes das minúsculas.

Entrada
Uma String contendo a frase a ser analisada, dois caracteres a serem buscados.

Saída
Imprimir o caractere que tenha a maior quantidade de ocorrências na Frase, ou empate.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String texto = scanner.nextLine();
		char l1 = scanner.nextLine().charAt(0);
		char l2 = scanner.nextLine().charAt(0);
		
		
		int aux1 = 0;
		int aux2 = 0;
		
		for(int i = 0; i < texto.length();i++){
		    if(texto.charAt(i) == l1){
		        aux1++;
		    }else if(texto.charAt(i) == l2){
		        aux2++;
		    }
		}
		
		if(aux1 > aux2){
		    System.out.println(l1);
		}else if(aux2 > aux1){
		    System.out.println(l2);
		}else{
		    System.out.println("empate");
		}
		
		scanner.close();
	}
}
