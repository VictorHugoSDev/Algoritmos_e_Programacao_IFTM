/******************************************************************************
Localize o(s) erro(s) na função recursiva abaixo e corrige-a. Indique, através de comentários, a linha onde ocorre o erro, 
explique qual regra não foi atendida e uma possível solução para o erro 
(como não há uma definição do problema podemos ter várias modificações possíveis).

funcao recursiva original com defeito:
private static int funcaoFF(int n) {
        if (n == 1){
            return funcaoFF(n-1);
        }else if (n % 2 == 0){
            return funcaoFF(n/2);
        }else {
            return funcaoFF((n-1)/2) + funcaoFF((n+1)/2);
        }      
    }
A função principal está correta e não precisa sofrer modificações:

public static void main(String[] args) throws IOException {
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 System.out.println("ff(" + n + ") = " + funcaoFF(n));
 s.close();
}

Regras:

Todos as funções recursivas devem obedecer a três leis importantes:

Uma função recursiva deve ter um caso base / caso da parada (condição no qual não haverá mais chamadas recursivas);
Uma função recursiva deve mudar o seu estado(parâmetros) e se aproximar do caso base (condição no qual o algoritmo para);
Uma função recursiva deve chamar a si mesmo, recursivamente.

Entrada
Um valor inteiro n.

Saída
Resultado conforme tabela abaixo

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.println("ff(" + n + ") = " + funcaoFF(n));
    s.close();
    }
    
    private static int funcaoFF(int n) {
        if (n <= 1){
            return 1;
            // Nesse caso está faltando um caso base / caso de parada, na verdade o n deve ser <= 1 para que pare a recusividade
            // alterando então a condição de n == 1 para n <= 1, após essa alteração condição, tem que alterar o retorno, 
            // pois está retornando infinitamente a recursividade, sendo assim a condição necessária para parada
            // deve ser modificado de return funcaoFF(n-1) para apenas return 1.
        }else if (n % 2 == 0){
            return funcaoFF(n/2);
        }else {
            return funcaoFF((n-1)/2) + funcaoFF((n+1)/2);
        }      
    }
}
