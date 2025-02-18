/******************************************************************************
Faca um programa em Java que recebe uma frase e imprima a quantidade de ocorrincias de uma
determinada letra e uma frase com todas as palavras que tenham essa letra, separadas por "".
Nesse exercicio, letras maiusculas e minusculas sao iguais (a=A).

Entrada
l : String fornecida, que contenha diversas palavras.
c : caractere que devera ser buscado na String l.

Saida
quantidade - numero de ocorroncias de c em l.

frase - frase que contenha todas as palavras no qual ocorre a letra c.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto = scanner.nextLine();
		char l = scanner.nextLine().charAt(0);
		char L = Character.toUpperCase(l);

		int aux = 0;

		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == l || texto.charAt(i) == L) {
				aux++;
			}
		}

		System.out.println(aux);

		String [] textoseparado = texto.split(" ");

		for(int i = 0; i < textoseparado.length; i++) {
			if(textoseparado[i].indexOf(l) != -1 || textoseparado[i].indexOf(L) != -1) {
				if(i < textoseparado.length - 1) {
					System.out.print(textoseparado[i] + " ");
				} else {
					System.out.print(textoseparado[i]);
				}

			}
		}

		System.out.println();

		scanner.close();
	}
}
