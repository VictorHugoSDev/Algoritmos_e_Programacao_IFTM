import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int x = scanner.nextInt();
		
		quadradoPares(x, 1);
		
	}
	
	public static void quadradoPares(int x, int i){
        if(i >  x){
            return;
        }
        
        if(i % 2 == 0){
            long quadrado = (long) i * i;
            System.out.printf("%d^2 = %d\n",i,quadrado);
        }
    
    quadradoPares(x, i + 1);
	}
}
