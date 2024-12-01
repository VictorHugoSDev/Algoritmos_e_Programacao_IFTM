import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String valor = scanner.nextLine();
		String mascaraValor = "^R\\$ (100|[1-9]\\d{2,4})\\.\\d{2}$";
		
		Pattern pattern = Pattern.compile(mascaraValor);
		
		Matcher verificar = pattern.matcher(valor);
		
		if(verificar.matches()){
		    System.out.println("Valor válido");
		}else{
		    System.out.println("Valor inválido");
		}
		
		scanner.close();
	}
}
