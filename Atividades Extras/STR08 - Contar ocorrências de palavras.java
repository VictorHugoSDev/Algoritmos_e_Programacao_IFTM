/*Faça um programa que recebe um texto T e uma palavra S. 
O programa deve contar quantas palavras presentes em T que tenham como parte a palavra S. Imprimir a quantidade encontrada.

obs.:
    Desconsiderar acentos.
    Utilizar as funções split e contains.

Entrada
Duas String.

Saída
A quantidade de ocorrências da segunda String na primeira.*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String T = scanner.nextLine();
		String S = scanner.nextLine();
		
		String [] frase =  T.split(" ");
		
		int aux = 0;
		
		for(String palavra: frase){
		    if(palavra.contains(S)){
		        aux++;
		    }
		}

		System.out.println(aux);
		
		scanner.close();
	}
}
