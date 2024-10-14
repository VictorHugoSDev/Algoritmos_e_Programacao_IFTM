import java.util.Scanner;

public class Main
{   
    static int cont = -1;
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int vezes = scanner.nextInt();
		
		for(int i = 0; i < vezes; i++){
		    int x = scanner.nextInt();
		    int resultado = calcularFibonacci(x);
		    System.out.println("fib("+ x + ") = " + cont + " calls = " +  resultado);
		    cont = -1;
		}
	}
	
	static int calcularFibonacci(int x){
	    cont++;
	    if(x<=1){
	        return x;
	    }

	    return calcularFibonacci(x - 1) + calcularFibonacci(x - 2);
	}
}
