/******************************************************************************

Crie um programa em Java para gerenciar uma lista de clientes. Cada cliente
 deve possuir as seguintes informações encapsuladas:
 ● Nome (String)
 ● CPF (String)
 ● Idade (int)
 O programa deve:
 a) Permitir que o usuário adicione novos clientes. A entrada de dados deve 
parar quando o usuário digitar "fim" como nome.
 b) Exibir a lista de todos os clientes cadastrados.
 c) Permitir que o usuário pesquise um cliente pelo CPF. Se o cliente for 
encontrado, exibir todos os seus dados; caso contrário, informar que o cliente
 não está na lista.
 d) Remover um cliente da lista ao informar seu CPF. Após a remoção, exibir a 
lista atualizada.
 e) Remover todos os clientes da lista.
 Sugestão de Menu:
 1. Inserir novo Cliente
 2. Listar todos os clientes
 3. Buscar Cliente pelo CPF
 4. Remover cliente pelo CPF
 5. Apagar Lista
 6. Sair


*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar){
            System.out.println("MENU");
            System.out.println("1. Inserir novo cliente");
            System.out.println("2. Listar todos os clientes");
            System.out.println("3. Buscar cliente pelo CPF");
            System.out.println("4. Remover cliente pelo CPF");
            System.out.println("5. Apagar lista");
            System.out.println("6. Sair");
            
            
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            if(escolha == 1){
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.nextLine();
                
                System.out.print("Digite o CPF do cliente: ");
                String cpf = scanner.nextLine();
                
                System.out.print("Digite a idade do cliente: ");
                int idade = scanner.nextInt();
                
                Cliente novoCliente = new Cliente(nome, cpf, idade);
                listaClientes.add(novoCliente);
                
                System.out.println("Cliente cadastrado com sucesso!");
                
            }else if(escolha == 2){
                if(listaClientes.isEmpty()){
                    System.out.println("Nenhum cliente cadastrado!");
                    System.out.println("------------------------------");
                }else{
                    System.out.println("Lista de clientes:");
                    for(Cliente cliente: listaClientes){
                        cliente.exibirCliente();
                        System.out.println("------------------------------");
                    }
                }
                
            }else if(escolha == 3){
                System.out.print("Digite o CPF para consulta: ");
                String cpfConsultado = scanner.nextLine();
                
                Cliente clienteEncontrado = consultaClientePorCpf(listaClientes, cpfConsultado);
                
                if(clienteEncontrado != null){
                    System.out.println("Cliente encontrado.");
                    clienteEncontrado.exibirCliente();
                    System.out.println("------------------------------");
                }else{
                    System.out.println("Nenhum cliente encontrado com esse CPF.");
                }
            }else if(escolha == 4){
                System.out.print("Digite o CPF que deseja remover: ");
                String cpfRemover = scanner.nextLine();
                
                Cliente clienteRemovido = removerClientePorCpf(listaClientes, cpfRemover);
                
                if(clienteRemovido != null){
                    System.out.println("Cliente removido com sucesso!");
                    clienteRemovido.exibirCliente();
                    System.out.println("------------------------------");
                }else{
                    System.out.println("Nenhum cliente encontrado com esse CPF para remoção.");
                }
            }else if(escolha == 5){
                listaClientes.clear();
                System.out.println("Todos os clientes foram removidos com sucesso.");
            }else if(escolha == 6){
                System.out.println("Encerrando o programa!!!");
                continuar = false;
            }else{
                System.out.println("Escolha uma opção válida!!!");
            }
        }
        
        
        scanner.close();

       
    }
    
    public static class Cliente {
        private String nome;
        private String cpf;
        private int idade;
        
        public Cliente(String nome, String cpf, int idade) {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getCpf(){
            return cpf;
        }
        
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
        
        public int getIdade(){
            return idade;
        }
        
        public void setIdade(int idade){
            this.idade = idade;
        }
        
        public void exibirCliente(){
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Idade: " + idade);
        }
        
    }
    
    public static Cliente consultaClientePorCpf(ArrayList <Cliente> listaClientes, String cpf){
        for(Cliente cliente: listaClientes){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }
    
    public static Cliente removerClientePorCpf(ArrayList <Cliente> listaClientes, String cpf){
        for(Cliente cliente: listaClientes){
            if(cliente.getCpf().equals(cpf)){
                listaClientes.remove(cliente);
                return cliente;
            }
        }
        return null;
    }
}
