/******************************************************************************

Escreva  um  programa(método main)  que crie dois HashSet<Integer> com valores aleatórios. 
O programa deverá criar um novo HashSet que contenha a interseção entre os dois conjuntos (valores presentes em ambos), 
sem usar o método retainAll(). Compare os elementos manualmente, retorne um novo HashSet com a interseção 
e imprima os números presentes no novo HashSet. Na entrada dos números para um SET, pare quando digitar um número negativo

*******************************************************************************/
import java.util.Objects;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro conjunto de números:");
        preenchimento(set1, scanner);
        
        System.out.println("Digite o segundo conjunto de números:");
        preenchimento(set2, scanner);
        
        Set <Integer> intersecao = intersecaoEntreConjuntos(set1, set2);
        
        for(Integer numero: intersecao){
            System.out.print(numero + " ");
        }
        
        scanner.close();
    }
    
    public static void preenchimento(Set<Integer> conjunto,Scanner scanner){
        int numero;
        
        while(true){
            numero = scanner.nextInt();
            if(numero < 0){
                break;
            }
            
            conjunto.add(numero);
        }
    }
    
    public static Set<Integer> intersecaoEntreConjuntos(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersecao = new HashSet<>();
        
        for(Integer numero: set1){
            if(set2.contains(numero)){
                intersecao.add(numero);
            }
        }
        
        return intersecao;
    }
    
    
}
