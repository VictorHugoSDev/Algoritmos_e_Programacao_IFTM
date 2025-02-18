/******************************************************************************

Escreva um programa(método main) que recebe diversos nomes de
pessoas. Todos os nomes deverão ser armazenados em um ArrayList tipado para
Strings. O programa deverá parar quando o texto digitado for igual a “FIM”. O
programa deverá mostrar os nomes cadastrados em ordem inversa a qual foram
cadastrados, ou seja, do último para o primeiro.


*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String nome;

        while (true) {
            nome = scanner.nextLine();

            if (nome.equals("FIM")) {
                break;
            }

            nomes.add(nome);
        }
        
        for(int i = nomes.size() - 1; i >= 0; i--){
            System.out.println(nomes.get(i));
        }

        scanner.close();
    }
}
