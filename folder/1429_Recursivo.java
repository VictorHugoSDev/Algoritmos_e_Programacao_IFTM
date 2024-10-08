import java.util.Scanner;

public class Main
{
    public static Scanner s = new Scanner(System.in);
    public static int n;
    
    public static void main(String[] args) {
    
        while(true){
            n = s.nextInt();
            
            if(n == 0 || n > 99999){
                break;
            }
            
            calcularValor(n);
        }
    }
    
    public static void calcularValor(int n){
        String nStr = String.valueOf(n);
        int total = 0;
        
        for(int i = 0; i < nStr.length(); i++){
            int digito = Character.getNumericValue(nStr.charAt(i));
            int calculo = fatorial(nStr.length() - i);
            total += digito * calculo;
        }
        
        System.out.println(total);
    }
    
    public static int fatorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
