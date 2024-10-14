import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    while(true){
	        
    		int valor1 = scanner.nextInt();
    		int valor2 = scanner.nextInt();
    		
    		if(valor1 <= 0 || valor2<= 0){
    		    break;
    		}
		    
		    int menor = Math.min(valor1, valor2);
		    int maior = Math.max(valor1, valor2);

            for(int i = menor; i <= maior; i++){
                System.out.print(i + " ");
            }
            
            int soma = somatoria(menor, maior);
            System.out.printf("Sum=%d\n", soma);
	    }
		
	}
	
	public static int somatoria(int menor, int maior){
	    if(menor > maior){
	        return 0;
	    }
	    return menor + somatoria(menor + 1, maior);
	}
}
