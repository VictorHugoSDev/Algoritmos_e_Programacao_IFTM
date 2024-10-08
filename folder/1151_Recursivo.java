import java.util.Scanner;

public class Main
{   
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int x = scanner.nextInt();
	    
	    if(x < 46){
	        for(int i = 0; i < x; i++){
	            int valor = calcularFibonacci(i);
	            
	            System.out.print(valor);
	            
	            if(i < x - 1){
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
	
	public static int calcularFibonacci(int x){
	    if(x<=1){
	        return x;
	    }

	    return calcularFibonacci(x - 1) + calcularFibonacci(x - 2);
	}
}
