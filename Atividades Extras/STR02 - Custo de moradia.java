/*Faça um programa que recebe o valor double 'custo' e uma String 'cidade'. Faça o seguinte processamento:
  * Caso a 'cidade' seja igual a Uberlandia, então imprima "O custo de vida em Uberlandia e R$ 'custo'"
  * Caso a 'cidade' seja igual a Brasilia, então dobre o valor de 'custo' e imprima "O custo de vida em Brasilia e R$ 'custo'"
  * Caso seja outra cidade, então divida o valor de 'custo' por 2 e imprima "O custo de vida em 'cidade' e R$ 'custo'"
  * Não precisam utilizar acento nesse exemplo. 
  
Entrada
Um número double custo e uma String que representa o nome da cidade

Saída
Imprima o custo de vida na cidade, conforme exemplo abaixo*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    float valor = scanner.nextFloat();
	    scanner.nextLine();
	    String cidade = scanner.nextLine();
	    float custo = 0;
	    
	    if(cidade.equals("Uberlandia")){
	        custo = valor;
	        System.out.printf("O custo de vida em %s e R$ %.2f\n", cidade, custo);
	    }else if(cidade.equals("Brasilia")){
	        custo = valor * 2;
	        System.out.printf("O custo de vida em %s e R$ %.2f\n", cidade, custo);
	    }else{
	        custo = valor / 2;
	        System.out.printf("O custo de vida em %s e R$ %.2f\n", cidade, custo);
	    }
	    
	    scanner.close();
	}
}
