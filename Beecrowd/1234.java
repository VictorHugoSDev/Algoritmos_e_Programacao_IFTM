import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        while(scanner.hasNextLine()){
            String frase = scanner.nextLine();
            String resultado = fraseDancante(frase);
            System.out.println(resultado);
        }

        scanner.close();
    }
    
    public static String fraseDancante(String frase) {
        String resultado = "";
        boolean maiusculo = true;
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            if (c != ' ') {
                if (maiusculo) {
                    resultado += Character.toUpperCase(c);
                } else {
                    resultado += Character.toLowerCase(c);
                }
                maiusculo = !maiusculo;
            } else {
                resultado += c;
            }
        }
        return resultado;
    }
}
