import java.util.Scanner;

public class Main
{   
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int t = scanner.nextInt();
	    int n = scanner.nextInt();
	    
	    imprimirRepeticao(t, n);

	    scanner.close();
		
	}
	
	static void imprimirRepeticao(int t, int n){
        
        if(n<=0){
            return;
        }
        if(n == 1){
            System.out.println(t);
            return;
        }
        
        System.out.printf("%d-", t);
        
        imprimirRepeticao(t, n-1);
	}
}
