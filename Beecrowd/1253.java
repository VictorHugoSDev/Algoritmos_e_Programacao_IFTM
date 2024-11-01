import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < N; i++){
            String linha = scanner.nextLine().trim();
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            
            cifraCesar(linha, quantidade);
        }
        
        scanner.close();
    }
    
    public static void cifraCesar(String linha, int quantidade) {
        String novaLinha = "";

        for(int i = 0; i < linha.length(); i++){
            char letra = linha.charAt(i);
            
            if(letra >= 'A' && letra <= 'Z'){
                letra = (char) ((letra - 'A' - quantidade + 26) % 26 + 'A');
            }
            novaLinha += letra;
        } 
        
        System.out.println(novaLinha);
    }
}
