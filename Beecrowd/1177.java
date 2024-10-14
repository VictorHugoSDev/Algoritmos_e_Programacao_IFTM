import java.util.Scanner;

public class Main
{
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
    	int x = s.nextInt();
    	int[] vetor = new int[1000];
    	
    	preencherVetor(vetor, x, 0);
    	
	    for(int i = 0; i<1000; i++){
	        System.out.println("N[" + i + "] = " + vetor[i]);
	       
	    }
	}
	
	public static void preencherVetor(int vetor[],int x, int aux){
        if(aux >= 1000){
            return;
        }
        
        vetor[aux] = aux % x;
        preencherVetor(vetor, x, aux + 1);
	}
}
