/*
Implemente um programa em Java que verifique se uma String contém uma data válida no formato brasileiro (dd/mm/aaaa). 
A data deve atender os seguintes critérios:

O dia (dd) deve estar entre 01 e 31.
O mês (mm) deve estar entre 01 e 12.
O ano (aaaa) deve ter exatamente 4 dígitos.
A separação deve ser feita pelo caractere /.

Entrada
Uma String contendo a data

Saída
imprimir data inválida ou data válida*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 String data = scanner.nextLine();
		 String mascaraData = "^([0-2]?[0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/[0-9]{4}$";
		 
		 if(data.matches(mascaraData)){
		     System.out.println("Data válida");
		 }else{
		     System.out.println("Data inválida");
		 }
		 
		 scanner.close();
	}
}
