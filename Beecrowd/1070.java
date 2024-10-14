import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static int aux = 0;
    
	public static void main(String[] args) {
		
		int x = scanner.nextInt();
		
		impares(x);
		
	}
	
	public static void impares(int x){
	    if(aux == 6){
	        return;
	    }
	    if(x % 2 != 0){
	        System.out.println(x);
	        aux++;
	        impares(x + 2);
	    }
	    else{
	        impares(x + 1);
	    }
	}
}
