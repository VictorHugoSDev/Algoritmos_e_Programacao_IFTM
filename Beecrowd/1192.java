import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < N; i++){
            String caracteres = scanner.nextLine().trim();
            
            realizarCalculo(caracteres);
        }
        
        scanner.close();
    }
    
    public static void realizarCalculo(String caracteres) {
        char valor1Char = caracteres.charAt(0);
        char letra = caracteres.charAt(1);
        char valor2Char = caracteres.charAt(2);
        
        int valor1 = valor1Char - '0';
        int valor2 = valor2Char - '0';
        int calculo = 0;
        
        if(valor1 == valor2){
            calculo = valor1 * valor2;
        }else if(Character.isUpperCase(letra)){
            calculo = valor2 - valor1;
        }else{
            calculo = valor1 + valor2;
        }
        
        System.out.println(calculo);
    }
}
