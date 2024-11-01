import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int N = scanner.nextInt();
	    scanner.nextLine();
	    
	    for(int i = 0; i < N; i++){
	        String linha = scanner.nextLine().trim();
	        String [] palavras = linha.split(" ");
	        
	        String p1 = palavras[0];
	        String p2 = palavras[1];
	        
	        verificarEncaixe(p1, p2);
	        
	    }
	    
	    scanner.close();
	}
	
	public static void verificarEncaixe(String p1, String p2){
	    
        if(p2.length() > p1.length()){
            System.out.println("nao encaixa");
            return;
        }
        
        int comparacao = p1.length() - p2.length();
        
        for(int i = 0; i < p2.length(); i++){
            if(p1.charAt(comparacao + i) != p2.charAt(i)){
               System.out.println("nao encaixa");
               return;
            }
        }
        
	    System.out.println("encaixa");
	}
}
