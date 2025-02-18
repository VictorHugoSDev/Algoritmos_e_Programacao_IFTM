/*
Questão 2 (5,5 pontos): Crie um programa em Java (classe Main) que utilize um
HashMap<String, Animal> para armazenar animais, onde a chave é o registro do
animal. Na main crie um Menu que disponibilize as seguinte opções:
a) Adicionar um animal.
b) Remover um animal pelo registro.
c) Imprimir os dados dos animais
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Animal> mapAnimais = new HashMap<>();

        do{
            System.out.println("Menu:");
            System.out.println("a. Adicionar um animal:");
            System.out.println("b. Remover um animal pelo registro:");
            System.out.println("c. Imprimir os dados dos animais:");
            System.out.println("d. Sair");

            String opcao = sc.nextLine();

            switch(opcao) {
                case "a":
                    Animal animal = new Animal();
                    System.out.println("Digite o nome do animal: ");
                    String nome = sc.nextLine();
                    animal.setNome(nome);

                    System.out.println("Digite a idade do animal: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    animal.setIdade(idade);

                    System.out.println("Digite o nome do tutor do animal: ");
                    String nomeTutor = sc.nextLine();
                    animal.setNomeTutor(nomeTutor);

                    System.out.println("Digite o registro do animal: ");
                    String registro = sc.nextLine();
                    animal.setRegistro(registro);

                    mapAnimais.put(registro, animal);
                    break;

                case "b":
                    if(mapAnimais.isEmpty()){
                        System.out.println("Lista vazia!");
                    }else{
                        System.out.println("Digite o registro do animal que deseja remover: ");
                        String registroRemover = sc.nextLine();

                        if(mapAnimais.containsKey(registroRemover)){
                            mapAnimais.remove(registroRemover);
                            System.out.println("Animal removido com sucesso!");
                        }else{
                            System.out.println("Registro não encontrado!");
                        }
                    }
                    break;

                case "c":
                    if(mapAnimais.isEmpty()){
                        System.out.println("Lista vazia!");
                    }else{
                        System.out.println("Lista dos animais:");
                        for (Map.Entry<String, Animal> entry : mapAnimais.entrySet()) {
                            Animal anim = entry.getValue();
                            System.out.println("Registro: " + anim.getRegistro());
                            System.out.println("Nome: " + anim.getNome());
                            System.out.println("Idade: " + anim.getIdade());
                            System.out.println("NomeTutor: " + anim.getNomeTutor());
                            System.out.println();
                        }
                    }
                    break;

                case "d":
                    sc.close();
                    return;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }while(true);
    }

    public static class Animal {
        private String nome;
        private int idade;
        private String nomeTutor;
        private String registro;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getNomeTutor() {
            return nomeTutor;
        }

        public void setNomeTutor(String nomeTutor) {
            this.nomeTutor = nomeTutor;
        }

        public String getRegistro() {
            return registro;
        }

        public void setRegistro(String registro) {
            this.registro = registro;
        }
    }
}
