import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] palavrasCorretas = {"one", "two", "three"};
        String[] numeros = {"1", "2", "3"};
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < N; i++) {
            String palavra = scanner.nextLine();
            String resultado = confirmarPalavra(palavra, palavrasCorretas, numeros);
            System.out.println(resultado);
        }
        
        scanner.close();
    }
    
    public static String confirmarPalavra(String palavra, String[] palavrasCorretas, String[] numeros) {
        for (int i = 0; i < palavrasCorretas.length; i++) {
            
            if(palavra.length() == palavrasCorretas[i].length()){
                int erros = contarErros(palavra, palavrasCorretas[i]);
                
                if (erros == 0) {
                    return numeros[i];
                } else if (erros == 1) {
                    return numeros[i];
                }
            }
        }
        return "Não reconhecido";
    }
    
    public static int contarErros(String palavra, String correta) {
        int erros = 0;
        
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != correta.charAt(i)) {
                erros++;
            }
        }
        return erros;
    }
}
