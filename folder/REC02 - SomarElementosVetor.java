import java.util.Scanner;

public class Main
{   
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    int x = scanner.nextInt();
	    
	    int [] vetor = new int [x];
	    
	    for(int i  = 0; i < x;i++){
	        vetor[i] =  scanner.nextInt();
	    }
	    
	    System.out.println(somarVetor(vetor, 0));
        
	    scanner.close();
		
	}
	
	static int somarVetor(int [] vetor, int x){
        
        if(x == vetor.length - 1){
            return vetor[x];
        }
        
        return vetor[x] + somarVetor(vetor, x + 1);
        
	}

}
