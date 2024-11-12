/*Faça um programa que recebe como entrada uma frase T. 
O programa deverá imprimir as 3 primeiras letras de todas as palavras, que tenham mais de 3 caracteres, presentes na frase T.

obs.:
    Não considerar acentos.
    considerar o ponto e a virgula como parte das palavras.

Entrada
Uma String T.

Saída
Imprimir as três primeiras letras de cada palavra da frase T, conforme exemplo abaixo.*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String T = scanner.nextLine();
		
		String [] frase =  T.split(" ");
		
		for(String palavra: frase){
		    if(palavra.length() > 3){
		        System.out.println(palavra.substring(0,3));
		    }
		}
		
		scanner.close();
	}
}
