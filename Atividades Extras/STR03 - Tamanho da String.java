/* Fazer um programa para ler um texto. Caso o texto lido tenha uma quantidade de caracteres <= 10, imprimir "pequeno". Caso contrário, imprimir "grande".

Entrada
Uma String.

Saída
Imprimir pequeno, caso o tamanho seja menor ou igual a 10 caracteres, ou grande, caso contrário */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String texto = scanner.nextLine();
	    
	    if(texto.length() <= 10){
	        System.out.println("pequeno");
	    }else{
	        System.out.println("grande");
	    }
	    
	    scanner.close();
	}
}
