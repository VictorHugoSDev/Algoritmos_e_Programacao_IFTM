/******************************************************************************
Implemente um programa em Java que verifique se uma String contém um CNPJ válido. 
O CNPJ deve seguir o formato brasileiro e atender os seguintes critérios:
Deve conter exatamente 14 dígitos numéricos.
Pode ser digitado com ou sem separadores (. e / e -).
Exemplo válido: 12.345.678/0001-95 ou 12345678000195.

Entrada
Uma String contendo o CNPJ

Saída
Imprimir CNPJ válido ou CNPJ inválido, conforme regras acima
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cnpj = scanner.nextLine();
        
        String mascaraSemSeparadores = "^[0-9]{14}$";
        
        String mascaraComSeparadores = "^([0-9]{2})\\.?[0-9]{3}\\.?([0-9]{3})\\/?([0-9]{4})\\-?([0-9]{2})$";
        
        if (cnpj.matches(mascaraSemSeparadores)) {
            System.out.println("CNPJ válido");
        } else if (cnpj.matches(mascaraComSeparadores)) {
            System.out.println("CNPJ válido");
        } else {
            System.out.println("CNPJ inválido");
        }
        
        scanner.close();
	}
}
