/******************************************************************************

Crie um programa em Java que preencha uma List<Integer> com elementos duplicados, 
converta-a para um HashSet e depois de volta para uma List, removendo as duplicatas. 
Observe que não será mantido a ordem de entrada, pois o HashSet não mantem ordem. 
Na entrada dos números pare quando digitar um número negativo.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List <Integer> numeros = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os números para a lista:");
        preenchimento(numeros, scanner);
        
        Set <Integer> numerosSet = new HashSet<>(numeros);
        
        List <Integer> numerosSemDuplicatas = new ArrayList<>(numerosSet);
        
        for(int num: numerosSemDuplicatas){
             System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static void preenchimento(List <Integer> numeros,Scanner scanner){
        int numero;
        
        while(true){
            numero = scanner.nextInt();
            if(numero < 0){
                break;
            }
            
            numeros.add(numero);
        }
    }
}
