/******************************************************************************

Crie um programa em Java que Verifique a existência de uma determinada string dentro de um conjunto: 
● Crie um HashSet para armazenar um conjunto de strings. Entre diversas palavras até digitar “fim”. 
● Verifique se uma determinada string existe no conjunto. 
● Utilize o método contains() para essa verificação. 

*******************************************************************************/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        
        while(true){
            nome = scanner.nextLine();
            
            if(nome.equals("fim")){
                break;
            }
            
            nomes.add(nome);
        }
        
        String verificarNome = scanner.nextLine();
        
        if(nomes.contains(verificarNome)){
            System.out.println("Existe");
        }else{
            System.out.println("Não existe");
        }
        
        scanner.close();
    }
}
