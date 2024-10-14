/*
Fazer uma função recursiva que recebe um texto contendo um número (N) e um número inteiro (d) que representa o digito a ser buscado. 
A função deve determinar quantas vezes o dígito 'd' ocorre no número N. O valor de N será superior a 0.
dica1.: capture o digito com o operador %. N%10 retorna o último digito do número N, o dígito mais a direita.
dica2.: O método Character.getNumericValue(char) retorna o número inteiro correspondente ao caractere.
dica3.: Utilizar o método Integer.parseInt(N.substring(0,1)). Esses métodos convertem o primeiro caractere para inteiro.
dica4.: Utilizar a tabela asc: t.charAt(pos) - 48. O número zero esta na posição 48 da tabela asc, então subtraindo 48, achamos o número inteiro.

Entrada
Dois números inteiros n e d.

Saída
Imprimir a quantidade de ocorrências do número d dentro do número n.*/
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        int ocorrencias = contarOcorrencias(n, d);
        
        System.out.println(ocorrencias);
    }
    
    public static int contarOcorrencias(int n, int d){
        if(n==0){
            return 0;
        }
        
        int ultimoDigito = n % 10;
        
        int resultadoContagem = contarOcorrencias(n / 10, d);
        
        if(ultimoDigito == d){
            return 1 + resultadoContagem;
        }else{
            return resultadoContagem;
        }
    }
}
