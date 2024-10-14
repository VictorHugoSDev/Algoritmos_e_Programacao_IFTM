import java.util.Scanner;
public class Main
{
    public static Scanner s = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	    int x = s.nextInt();
	    
	    calcular(x, 1);
	  
	}
	
	public static void calcular(int x, int maximo){
	    if(maximo > 10000){
	        return;
	    }
	    
	    if(maximo % x == 2){
	        System.out.println(maximo);
	    }
	    
	    calcular(x, maximo + 1);
	}
}
