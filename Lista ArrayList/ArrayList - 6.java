/******************************************************************************

Crie um programa em Java que seja capaz de cadastrar  contatos. Para tal, é
necessário criar um ArrayList tipado para a classe Contato, que deverá seguir a
estrutura abaixo:
A classe Contato conterá os seguintes atributos:
Nome (String)
Telefone (String)
Celular (String)
Email (String)
Os atributos da classe Contato deverão estar encapsulados
A classe Main deverá criar uma lista com base na classe Contato, faça:
ArrayList<Contato> listaContatos = new ArrayList<Contato>();
Então apresentar o menu abaixo, permitindo ao usuário cadastrar novos contatos e
listar os contatos já cadastrados.
Sugestão de Menu:
 1. Inserir Contato
 2. Listar Contatos
 3. Sair


*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Contato> listaContatos = new ArrayList<Contato>();

        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar){
            System.out.println("MENU");
            System.out.println("1. Inserir Contato");
            System.out.println("2. Listar Contato");
            System.out.println("3. Sair");
            
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            if(escolha == 1){
                System.out.print("Digite o nome do contato: ");
                String nome = scanner.nextLine();
                
                System.out.print("Digite o telefone do contato: ");
                String telefone = scanner.nextLine();
                
                System.out.print("Digite o celular do contato: ");
                String celular = scanner.nextLine();
                
                System.out.print("Digite o email do contato: ");
                String email = scanner.nextLine();
                
                Contato novoContato = new Contato(nome, telefone, celular, email);
                listaContatos.add(novoContato);
                
                System.out.println("Contato cadastrado com sucesso!");
                
            }else if(escolha == 2){
                if(listaContatos.isEmpty()){
                    System.out.println("Nenhum contato cadastrado");
                    System.out.println("------------------------------");
                }else{
                    System.out.println("Lista de contatos:");
                    for(Contato contato: listaContatos){
                        contato.exibirContato();
                        System.out.println("------------------------------");
                    }
                }
                
            }else if(escolha == 3){
                System.out.println("Encerrando o programa");
                continuar = false;
            }else{
                System.out.println("Escolha uma opção válida");
            }
        }
        
        
        scanner.close();

       
    }
    
    public static class Contato {
        private String nome;
        private String telefone;
        private String celular;
        private String email;
        
        public Contato(String nome, String telefone, String celular, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.celular = celular;
            this.email = email;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getTelefone() {
            return telefone;
        }
        
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    
        public String getCelular() {
            return celular;
        }
        
        public void setCelular(String celular) {
            this.celular = celular;
        }
        
        public String getEmail() {
            return email;
        }
        
        public void setEmail(String email) {
            this.email = email;
        }
        
        public void exibirContato(){
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
            System.out.println("Celular: " + celular);
            System.out.println("Email: " + email);
        }
        
    }
}
