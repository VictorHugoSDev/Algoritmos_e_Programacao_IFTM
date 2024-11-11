/* Faça um programa que recebe como entrada a variável String 'data'. Então pegue a substring com os dois primeiros caracteres e salve em outra variável String 'd'. Então imprima "Estamos no dia 'd' do mês.".

Entrada
Uma String

Saída
Imprimir o dia do mês, conforme exemplo da tabela. */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String data = scanner.nextLine();
	    
	    String [] datas = data.split("/");
	    
	    String d = datas[0];
	    
	    System.out.println("Estamos no dia " + d + " do mês.");
	    
	    scanner.close();
	}
}
