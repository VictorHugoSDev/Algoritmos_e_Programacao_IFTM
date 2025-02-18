/******************************************************************************

Crie um programa em Java que gerencia a lista de convidados de um evento. 
O sistema deve permitir adicionar convidados, remover convidados e verificar se uma pessoa está na lista de convidados. 
Cada convidado terá apenas seu nome (String) armazenado. Utilize HashSet para implementar a lista de convidados. Pode 
trabalhar com a classe Contato ou utilizar apenas String. O sistema deve ter as seguintes funcionalidades 
disponibilizadas em um Menu: 
● Adicionar um convidado. 
● Remover um convidado. 
● Verifique se um convidado está na lista. 
● Exibir todos os convidados. 
● Imprimir a quantidade de convidados cadastrados. 
● Apagar todos os convidados.

*******************************************************************************/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> convidados = new HashSet<>();
        
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Adicionar um convidado.");
            System.out.println("2. Remover um convidado.");
            System.out.println("3. Verifique se um convidado está na lista.");
            System.out.println("4. Exibir todos os convidados.");
            System.out.println("5. Imprimir a quantidade de convidados cadastrados.");
            System.out.println("6. Apagar todos os convidados.");
            System.out.println("7. Sair.");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            switch(escolha){
                case 1:
                    System.out.print("Digite o nome do convidado a ser adicionado: ");
                    nome = scanner.nextLine();
                    convidados.add(nome);
                    break;
                case 2:
                    System.out.print("Digite o nome do convidado a ser removido: ");
                    nome = scanner.nextLine();
                    convidados.remove(nome);
                    break;
                case 3:
                    System.out.print("Digite o nome que deseja verificar se esta na lista: ");
                    nome = scanner.nextLine();
                    if(convidados.contains(nome)){
                        System.out.println("O " + nome + " está na lista!");
                    }else{
                        System.out.println("O " + nome + " NÃO está na lista!");
                    }
                    break;
                case 4:
                    if(convidados.isEmpty()){
                        System.out.println("Nenhum convidado na lista!");
                    }else{
                        for(String convidado: convidados){
                            System.out.print(convidado + " ");
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    System.out.println("A quantidade de convidados são: " + convidados.size());
                    break;
                case 6:
                    convidados.clear();
                    System.out.println("Todos os convidados foram removidos!!!");
                    break;
                case 7:
                    System.out.println("Finalizando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        }
        
        
    }
}
