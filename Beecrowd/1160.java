import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		for(int i = 0; i < t; i++){

		    int A = s.nextInt();
    		int B = s.nextInt();
    		double ga = s.nextDouble();
    		double gb = s.nextDouble();
    		
    		int anos = calcularAnos(A, B, ga, gb, 0);
    		
        	if(anos > 100){
        	   System.out.println("Mais de 1 seculo.");
        	}
        	 else{
        	   System.out.println(anos + " anos.");
        	}
    		
		}
	}
	
	public static int calcularAnos(int A, int B, double ga, double gb, int anos){
	    if(A > B || anos > 100){
	        return anos;
	    }
	    
	    A += ((A * ga) / 100);
        B += ((B * gb) / 100);
        
        return calcularAnos(A, B, ga, gb, anos + 1);
	}
}
