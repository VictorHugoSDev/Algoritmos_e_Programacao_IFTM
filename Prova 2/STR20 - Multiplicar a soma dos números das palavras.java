/******************************************************************************
Faça um programa que recebe uma frase, com diversas palavras. Some os dígitos numéricos em cada uma das palavras e 
então multiplique os valores encontrados. Se uma palavra não conter números ou o resultado da soma for 0, 
considere o valor 1 para essa palavra.

Entrada
Uma String contendo uma frase.

Saída
O resultado da multiplicação da soma dos dígitos numéricos presentes em cada palavra, no formato : "Resultado = " + valor

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto = scanner.nextLine();

		String [] textoseparado = texto.split(" ");
		
		int resultado = 1;
		
		for(String palavra: textoseparado){
		    int soma = 0;
		    
		    for(char c: palavra.toCharArray()){
		        if(Character.isDigit(c)){
		            soma += Character.getNumericValue(c);
		        }
		    }
		    
		    if(soma == 0){
		        soma = 1;
		    }
		    
		    resultado *= soma;
		}
		
		System.out.println("Resultado = " + resultado);

		scanner.close();
	}
}
