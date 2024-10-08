import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args) {
        
    	Scanner s = new Scanner(System.in);
    	
    	int x = s.nextInt();
    	double comida[] = new double[x];
    	
    	for(int i=0; i<x; i++){
    	    comida[i] = s.nextDouble();
    	}
    	
    	for(int i=0; i<x;i++){
    	    double quantidade = comida[i];
    	    int dias = calcularDias(quantidade, 0);
    	    System.out.println(dias + " dias");
	    }
	}
	
	public static int calcularDias(double quantidade, int dias){
	    if(quantidade <= 1){
	        return dias;
	    }
	    return calcularDias(quantidade / 2, dias + 1);
	}
}
