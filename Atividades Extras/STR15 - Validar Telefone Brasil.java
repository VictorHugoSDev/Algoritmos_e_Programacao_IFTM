/*Implemente um programa em Java que identifique se uma String contém um número de telefone válido no formato brasileiro. 
O número deve estar no seguinte formato:

Deve incluir o código da área (2 dígitos) entre parênteses, ex.: (34).
Deve conter 9 dígitos para celulares (começando com 9) ou 8 dígitos para telefones fixos.
O número deve estar no formato: (11) 98765-4321.

O programa deverá retornar se o número é celular, fixo ou inválido.
Obs.: para imprimir ( utilize \(, o mesmo para o ) .


Entrada
Uma String

Saída
Imprimir Celular, fixo ou inválido*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String telefone = scanner.nextLine();
		String mascaraCelular = "^\\([1-9]{2}\\)\\s(?:[2-8]|9[0-9])[0-9]{3}\\-?[0-9]{4}$";
		String mascaraTelefone = "^\\([1-9]{2}\\)\\s(?:[2-5])[0-9]{3}\\-?[0-9]{4}$";
		
		if(telefone.matches(mascaraTelefone)){
		    System.out.println("Fixo");
		}else if(telefone.matches(mascaraCelular)){
		    System.out.println("Celular");
		}else{
		    System.out.println("inválido");
		}
		
		scanner.close();
	}
}
