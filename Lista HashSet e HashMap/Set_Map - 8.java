/*
Crie uma classe Produto com os atributos id (String) e nome (String). Crie um
programa(Main) que utilize um HashMap<String, Produto> para armazenar produtos,
onde a chave é o id. Na main crie um Menu que disponibilize as seguinte opções:
a) Adicionar um produto.
b) Buscar um produto pelo id.
c) Remover um produto pelo id.
d) Listar todos os produtos.
*/

import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Produto> produtos = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String id;
        String nome;

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Adicionar um produto.");
            System.out.println("2. Buscar um produto pelo ID.");
            System.out.println("3. Remover um produto pelo ID.");
            System.out.println("4. Listar todos os produtos.");
            System.out.println("5. Sair.");
            System.out.print("Escolha uma opção: ");

            int escolha = sc.nextInt();
            sc.nextLine();

            switch(escolha){
                case 1:
                    System.out.print("Digite o ID do produto a ser adicionado: ");
                    id = sc.nextLine();
                    System.out.print("Digite o nome do produto a ser adicionado: ");
                    nome = sc.nextLine();

                    Produto produto = new Produto(id, nome);

                    produtos.put(id, produto);

                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o ID do produto a ser buscado: ");
                    id = sc.nextLine();

                    if(produtos.containsKey(id)){
                        Produto p = produtos.get(id);
                        System.out.println("O produto " + p + " foi encontrado!");
                    }else{
                        System.out.println("O produto não foi encontrado!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID do produto a ser removido: ");
                    id = sc.nextLine();
                    if(produtos.containsKey(id)){
                        Produto p = produtos.get(id);
                        produtos.remove(id);
                        System.out.println("O produto " + p + " removido com sucesso!");
                    }else{
                        System.out.println("O produto não foi encontrado!");
                    }
                    break;
                case 4:
                    if(produtos.isEmpty()){
                        System.out.println("Nenhum produto na lista!");
                    }else{
                        for(HashMap.Entry<String, Produto> entry : produtos.entrySet()){
                            System.out.println("ID: " + entry.getKey() + ", Produto: " + entry.getValue());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Finalizando o programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        }
    }

    static class Produto{
        private String id;
        private String nome;

        public Produto(String id, String nome){
            this.id = id;
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return id.equals(((Produto) o).getId());
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString(){
            return nome;
        }
    }
}
