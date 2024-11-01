import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int M;
        int N;
        
        do{
            M = scanner.nextInt();
            N = scanner.nextInt();
            
            if(M == 0 && N == 0){
                break;
            }
            
            int soma = M + N;
            
            retirarZero(soma);
        }
        while(true);
        
        scanner.close();
    }
    
    public static void retirarZero(int soma) {
        String numero = String.valueOf(soma);
        
        String resultado = "";
        
        for(int i = 0; i < numero.length();i++){
            char c = numero.charAt(i);
            
            if(c != '0'){
                resultado += c;
            }
        }
        
        System.out.println(resultado);
    }
}
