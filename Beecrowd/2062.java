import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.nextLine();
        
        String entrada = scanner.nextLine().trim();
        
        String [] palavras = entrada.split(" ");
        
        for(int i = 0; i < N; i++){
            palavras[i] = corrigirPalavras(palavras[i]);
        }
        
        System.out.println(String.join(" ", palavras));
        
        scanner.close();
    }
    
    public static String corrigirPalavras(String palavra) {
        if(palavra.equals("OBI") || palavra.equals("URI")){
            return palavra;
        }
        if(palavra.length() == 3){
            if(palavra.charAt(0) == 'O' && palavra.charAt(1) == 'B'){
                return "OBI";
            }else if (palavra.charAt(0) == 'U' && palavra.charAt(1) == 'R'){
                return "URI";
            }
        }
        
        return palavra;
    }
}
