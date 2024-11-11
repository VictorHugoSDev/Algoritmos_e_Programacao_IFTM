/* Faça um programa que leia uma variável cpf, do tipo String. Verifique se o tamanho do CPF esta correto, um CPF precisa ter 11 dígitos. Caso ele esteja correto imprima 'valido', senão imprima 'invalido'.
  
Entrada
Uma String.

Saída
Imprimir valido ou invalido.*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String cpf = scanner.nextLine();
	    
	    if(cpf.length() == 11){
	        System.out.println("valido");
	    }else{
	        System.out.println("invalido");
	    }
	    
	    scanner.close();
	}
}
