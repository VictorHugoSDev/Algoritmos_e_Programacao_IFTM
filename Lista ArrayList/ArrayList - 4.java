/******************************************************************************

Crie um programa em Java que gerencie uma lista de convidados para uma festa. 
O programa deve:
a) Permitir ao usuário adicionar nomes à lista de convidados. A adição deve ser encerrada quando o usuário digitar a palavra "fim".
b) Antes de adicionar um nome, verificar se ele já está na lista. Se já estiver, exibir a mensagem “convidado existe” informando que o convidado já foi
adicionado.
c) Após encerrar a adição, exibir todos os nomes da lista.
d) Permitir que o usuário pesquise por um nome na lista de convidados e informe se ele está ou não na lista.
(Obrigatório o uso de ArrayList)


*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String nome;
        String convidado;

        while(true){
            
            nome = scanner.nextLine();

            if (nome.equals("fim")) {
                for(int i = 0; i < nomes.size() - 1; i++){
                 System.out.print(nomes.get(i) + "-");
                }
                System.out.println(nomes.get(nomes.size() - 1));
                break;
            }
            
            if(nomes.contains(nome)){
                System.out.println("convidado existente");
            }else{
                nomes.add(nome);
            }
        }
        
        while(true){
            convidado = scanner.nextLine();
            
            if(nomes.contains(convidado)){
                System.out.println("Existe um convidado chamado " + convidado);
            }else{
                System.out.println("Não existe convidado chamado " + convidado);
            }
        }
    
    }
}
