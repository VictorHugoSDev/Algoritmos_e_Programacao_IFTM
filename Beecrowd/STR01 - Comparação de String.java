/* Fazer um programa para ler dois textos e compará-los. Caso eles sejam iguais, imprimir "correto", caso contrário, imprimir "incorreto".

Entrada
Duas Strings

Saída
Imprimir correto, caso sejam iguais, ou incorreto, caso contrário. */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String palavra1 = scanner.nextLine();
	    String palavra2 = scanner.nextLine();
	    
	    if(palavra1.equals(palavra2)){
	        System.out.println("correto");
	    }else{
	        System.out.println("incorreto");
	    }
	    
	    scanner.close();
	}
}
