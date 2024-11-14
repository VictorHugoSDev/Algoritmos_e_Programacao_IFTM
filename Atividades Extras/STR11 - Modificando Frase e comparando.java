/******************************************************************************
Faça um programa que receba uma frase. Então, faça os seguintes processos:

* substitua todas as letras 'a' e 'A' pela letra '@';
* imprima a frase modificada;
* compare a primeira e última palavra da frase modificada e imprima "palavra1 _ palavra2", substitua o _ por (==, < ou >).

A comparação considera a ordem alfabética(tabela ascii) das palavras, ou seja, 'Oi' é maior que 'Dimetilaminofenildimetilpirazolona'.
caso a frase tenha menos que 3 palavras imprima "Frase invalida.".
obs.:
- Na tabela ascii @ é menor que letras e maior que números.
- Na tabela ascii letra maiúscula é menor que letra minuscula.
- A saída precisa ser exatamente igual ao formato requisitado.

Entrada
Uma String contendo uma frase

Saída
Imprimir a saída conforme regras acima e exemplo na tabela abaixo.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String novaFrase = "";
        String frase = scanner.nextLine();
        
        String [] palavras = frase.split(" ");
        
        if(palavras.length < 3){
            System.out.println("Frase invalida.");
        }else{
            for(int i = 0; i < frase.length(); i++){
                char letra = frase.charAt(i);
                char letraModificada;
                if((letra == 'A' || letra == 'a')){
                    letraModificada = '@';
                    
                }else{
                    letraModificada = letra;
                }
            novaFrase += letraModificada;
            }
            String [] palavraModificadas = novaFrase.split(" ");
        
            String primeiraPalavra = palavraModificadas[0];
            String ultimaPalavra = palavraModificadas[palavraModificadas.length - 1];
            
            System.out.println(novaFrase);
            
            int comparacao = primeiraPalavra.compareTo(ultimaPalavra);
            
            if(comparacao == 0){
                System.out.println("palavra1 == palavra2");
            } else if (comparacao < 0) {
                System.out.println("palavra1 < palavra2");
            } else {
                System.out.println("palavra1 > palavra2");
            }
        }
        
        scanner.close();
    }
}
