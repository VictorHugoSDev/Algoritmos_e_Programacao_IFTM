import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < N; i++){
            String linha = scanner.nextLine().trim();
            
            String [] palavras = linha.split(" ");
	        
	        String p1 = palavras[0];
	        String p2 = palavras[1];
            
            avançarLetras(p1, p2);
        }
        
        scanner.close();
    }
    
    public static void avançarLetras(String p1, String p2) {
        int aux = 0;
        
        for(int i = 0; i < p1.length(); i++){
            char letra1 = p1.charAt(i);
            char letra2 = p2.charAt(i);
            
            int avancos = (letra2 - letra1 + 26) % 26;
            aux += avancos;
        }
        
        System.out.println(aux);
    }
}
