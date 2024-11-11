/*Faça um programa que leia uma frase e então compare o primeiro e o último caractere digitado. O algoritmo precisa retornar um dos seguintes resultados:
1. Caso a frase tenha menos que 5 caracteres, retornar "invalida".
2. Caso os caracteres sejam iguais, retornar "iguais".
3. Caso os caracteres sejam diferentes, retornar "diferentes".

Entrada
Uma String	

Saída
Imprimir invalido, iguais ou diferentes, conforme regra apresentada acima. */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String texto = scanner.nextLine();
	    
	    if(texto.length() < 5){
	        System.out.println("invalida");
	    }else if(texto.charAt(0) == (texto.charAt(texto.length() - 1))){
	        System.out.println("iguais");
	    }else{
	        System.out.println("diferentes");
	    }
	    
	    scanner.close();
	}
}
