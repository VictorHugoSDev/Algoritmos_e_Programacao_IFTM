/******************************************************************************
 Requisitos:
 Classe Animal (Classe Base):
 a) Atributos encapsulados:
 i) String nome
 ii) int idade
 iii) String nomeTutor
 iv) String registro
 b) Métodos públicos (getters e setters) para acessar e modificar os atributos.

 Questão 1 (8 pontos): Crie um programa em Java para gerenciar uma lista de
 Animais. A classe Animal foi definida acima (Requisitos).

 O programa deve:
 1.Permitir que o usuário adicione novos Animais.
 2. Exibir a lista de todos os animais cadastrados.
 3. Imprimir Animais que tenham idade menor que 2 anos.
 4. Buscar Animais pelo nome do Tutor
 5. Remover todos os animais da lista.
 Sugestão de Menu:
 1. Inserir novo Animal
 2. Listar todos os animais
 3. Listar Animais Filhotes (<2 anos)
 4. Buscar Animal pelo nome do Tutor
 5. Apagar Lista
 6. Sair

 Questão 3 (3,5 pontos): Crie um programa em Java (classe Main) que utiliza um
 HashMap para armazenar nomes de tutores de animais. O programa deve
 receber(entrada do usuário ou continuação da questão 1) os nomes dos tutores e
 inserir em um HashSet. Imprima os nomes dos tutores ao fim do processo. Nessa
 questão a impressão não deve retornar nomes repetidos.

 *******************************************************************************/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Animal> animais = new ArrayList<>();
        Set <String> tutores = new HashSet<>();

        do{
            System.out.println("Menu:");
            System.out.println("1. Inserir novo Animal:");
            System.out.println("2. Listar todos os animais:");
            System.out.println("3. Listar Animais Filhotes (<2 anos):");
            System.out.println("4. Buscar Animal pelo nome do Tutor:");
            System.out.println("5. Apagar Lista:");
            System.out.println("6. Listar nomes de Tutores:");
            System.out.println("7. Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
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

                    tutores.add(nomeTutor);

                    System.out.println("Digite o registro do animal: ");
                    String registro = sc.nextLine();
                    animal.setRegistro(registro);

                    animais.add(animal);
                    break;
                case 2:
                    if(animais.isEmpty()){
                        System.out.println("Lista vazia!");
                    }else{
                        System.out.println("Lista de animais: ");
                        for(Animal a : animais){
                            System.out.println("Nome: " + a.getNome());
                            System.out.println("Idade: " + a.getIdade());
                            System.out.println("Nome do Tutor: " + a.getNomeTutor());
                            System.out.println("Registro: " + a.getRegistro());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    boolean encontrouFilhote = false;
                    if(animais.isEmpty()){
                        System.out.println("Lista vazia!");
                    }else{
                        System.out.println("Lista de animais com idade < 2 anos: ");
                        for(Animal a : animais){
                            if(a.getIdade() < 2) {
                                System.out.println("Nome: " + a.getNome());
                                System.out.println("Idade: " + a.getIdade());
                                System.out.println("Nome do Tutor: " + a.getNomeTutor());
                                System.out.println("Registro: " + a.getRegistro());
                                System.out.println();
                                encontrouFilhote = true;
                            }
                        }
                        if(!encontrouFilhote){
                            System.out.println("Não existe nenhum animal com idade menor que 2 anos!");
                        }
                    }
                    break;
                case 4:
                    if(animais.isEmpty()){
                        System.out.println("Lista vazia!");
                    }else{
                        System.out.println("Digite o nome do Tutor: ");
                        String tutor = sc.nextLine();
                        for(Animal a : animais){
                            if(a.nomeTutor.equals(tutor)){
                                System.out.println("Nome: " + a.getNome());
                                System.out.println("Idade: " + a.getIdade());
                                System.out.println("Nome do Tutor: " + a.getNomeTutor());
                                System.out.println("Registro: " + a.getRegistro());
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 5:
                    if(animais.isEmpty()){
                        System.out.println("Lista vazia!");
                    }else{
                        System.out.println("Deseja realmente apagar a lista (s/n): ");

                        String verificacao = sc.nextLine();

                        if(verificacao.equals("s")){
                            animais.clear();
                            System.out.println("Lista apagada com sucesso! ");
                        }else {
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nomes dos tutores: ");
                    for(String tutor : tutores){
                        System.out.println("Nome: " + tutor);
                    }
                    break;
                case 7:
                    sc.close();
                    return;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }while(true);
    }

  public static class Animal{
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

      @Override
      public boolean equals(Object obj) {
          if (this == obj) return true;
          if (obj == null || getClass() != obj.getClass()) return false;
          Animal animal = (Animal) obj;
          return nome.equals(animal.nome);
      }

      @Override
      public int hashCode() {
          return nome.hashCode();
      }
  }
}
