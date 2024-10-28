import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int [] qtdeLeds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	    
	    int N = scanner.nextInt();
	    scanner.nextLine();
	    
	    for(int i = 0; i < N; i++){
	        String valor = scanner.nextLine().trim();
	        leds(valor, qtdeLeds);
	    }
	    
	    scanner.close();
	}
	
	public static void leds(String valor, int[] qtdeLeds){
	    int totalLeds = 0;
	    
	    for (char c: valor.toCharArray()){
	        int digito = c - '0';
	        totalLeds += qtdeLeds[digito];
	    }
	    
	    System.out.println(totalLeds + " leds");
	}
}
