import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int N = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < N; i++){
            String linha = scanner.nextLine();
            
            int meio = linha.length() / 2;
            
            String primeiraMetade = linha.substring(0, meio);
            String segundaMetade = linha.substring(meio);
            
            String primeiraInvertida = new StringBuilder(primeiraMetade).reverse().toString();
            String segundaInvertida = new StringBuilder(segundaMetade).reverse().toString();
            
            String resultado = primeiraInvertida + segundaInvertida;
            
            System.out.println(resultado);
        }
        
        scanner.close();
	}
}   
