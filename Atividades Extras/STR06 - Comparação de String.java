/* Faça um programa que receba como entrada uma frase e então imprima cada letra e sua posição, veja o exemplo abaixo.

Entrada
Uma String

Saída
Imprimir uma letra em cada linha, conforme exemplo da tabela. */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String texto = scanner.nextLine();
	    int index = 0;
	    
	    for(char c: texto.toCharArray()){
	        System.out.println(index + " - " + c);
	        index++;
	    }
	    
	    scanner.close();
	}
}
