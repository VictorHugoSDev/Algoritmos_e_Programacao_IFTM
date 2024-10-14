/*Fazer uma função recursiva que recebe um vetor de números inteiros, a função deverá somar os elementos do vetor.

Faça um programa em Java que utilize a função e imprima o valor retornado por ela.

obs1.: quando percorremos um vetor a parada será quando a posição for igual a 0 ou igual a n-1, onde n é o tamanho do vetor. Para isso, é necessário criar um segundo parâmetro na função recursiva, que armazenará a posição atual. 
Vejo o modelo do código abaixo.
obs2.: o vetor deverá conter no mínimo 1 número.

Entrada
Um inteiro n e então n números inteiros.

Saída
Imprimir o resultado da soma dos n números.*/
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
