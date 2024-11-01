import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int primeiroDeslocamento = 3;
        int segundoDeslocamento = -1;
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < N; i++){
            String linha = scanner.nextLine().trim();
            
            criptografia(linha, primeiroDeslocamento, segundoDeslocamento);
        }
        
        scanner.close();
    }
    
    public static void criptografia(String linha, int primeiroDeslocamento, int segundoDeslocamento) {
        String novaLinha = "";
        
        for(int i = 0; i < linha.length(); i++){
            char letra = linha.charAt(i);
            char letraDeslocada;
            if((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')){
                letraDeslocada = (char) (letra + primeiroDeslocamento);
                
            }else{
                letraDeslocada = letra;
            }
            novaLinha += letraDeslocada;
        } 
        
        String linhaInvertida = inverterLinha(novaLinha);
        String linhaFinal = "";
        
        int metade = linhaInvertida.length() / 2;
        
        for(int i = 0; i < linhaInvertida.length(); i++){
            char letraInvertida = linhaInvertida.charAt(i);
            char letraFinal;
            
            if(i >= metade){
                letraFinal = (char) (letraInvertida + segundoDeslocamento);
            } else{
                letraFinal = letraInvertida;
            }
            
            linhaFinal += letraFinal;
        }
        
        System.out.println(linhaFinal);
    }
    
    public static String inverterLinha(String novaLinha){
        String linhaInvertida = "";
        
        for(int i = novaLinha.length() - 1;i >= 0; i--){
            linhaInvertida += novaLinha.charAt(i);
        }
        
        return linhaInvertida;
    }
}
