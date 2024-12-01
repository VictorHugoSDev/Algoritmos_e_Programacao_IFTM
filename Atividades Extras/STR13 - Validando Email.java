/*Implemente um programa em Java que receba uma String contendo um texto e verifique se ela é válida para representar um endereço de e-mail. Para isso, siga os seguintes critérios:

Um e-mail válido deve conter:
Uma sequência de letras, números ou os caracteres ., _ ou -, seguida de um @.
Depois do @, deve haver um domínio contendo letras, números ou . (ponto), seguido por um ponto.
ou seja, deve aceitar: 
iftm.edu
estudante.itm.edu
ava.iftm.edu
O domínio deve terminar com um sufixo de 2 a 6 letras (ex.: .com, .br, .gov).
O programa deve:
Solicitar ao usuário que insira uma String.
Utilizar Regex para validar o texto inserido.
Informar ao usuário se o texto é ou não um endereço de e-mail válido.


Entrada
Uma String.



Saída
Imprimir Email válido ou Email inválido.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String email = scanner.nextLine();
		String mascaraEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		
		Pattern pattern = Pattern.compile(mascaraEmail);
		
		Matcher verificar = pattern.matcher(email);
		
		if(verificar.matches()){
		    System.out.println("Email válido");
		}else{
		    System.out.println("Email inválido");
		}
		
		scanner.close();
	}
}
