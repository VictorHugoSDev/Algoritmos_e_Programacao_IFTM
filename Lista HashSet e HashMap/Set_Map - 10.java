/*
 Crie uma classe Aluno com os atributos matricula (String), nome (String) e cpf
(String). Crie um programa em Java (classe Main) que utilize um HashMap<String,
Aluno> para armazenar alunos, onde a chave é a matrícula. Em seguida, crie um
HashMap<String, Double> para armazenar as notas dos alunos, onde a chave é a
matrícula. Na main crie um Menu que disponibilize as seguinte opções:
a) Adicionar um aluno.
b) Adicionar uma nota a um aluno.
c) Calcular a média das notas de todos os alunos.
d) Imprimir os dados dos alunso
*/

import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;

public class Ex10 {
    public static void main(String[] args) {

        HashMap<String, Aluno> alunos = new HashMap<>();
        HashMap<String, Double> notas = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String matricula;
        String nome;
        String cpf;
        Double nota;
        Double somaNotas;
        int contadorNotas;

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Adicionar um aluno.");
            System.out.println("2. Adicionar uma nota a um aluno.");
            System.out.println("3. Calcular a média das notas de todos os alunos.");
            System.out.println("4. Imprimir os dados dos alunos.");
            System.out.println("5. Sair.");
            System.out.print("Escolha uma opção: ");

            int escolha = sc.nextInt();
            sc.nextLine();

            switch(escolha){
                case 1:
                    System.out.print("Digite a matricula do(a) aluno(a) a ser adicionado: ");
                    matricula = sc.nextLine();
                    System.out.print("Digite o nome do(a) aluno(a) a ser adicionado: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o CPF do(a) aluno(a) a ser adicionado: ");
                    cpf = sc.nextLine();


                    Aluno aluno = new Aluno(matricula, nome , cpf);

                    alunos.put(matricula, aluno);

                    System.out.println("Aluno(a) adicionado (a) com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite a matricula do(a) aluno (a) a ser buscado: ");
                    matricula = sc.nextLine();

                    if(alunos.containsKey(matricula)){
                        Aluno a = alunos.get(matricula);
                        System.out.print("O aluno(a) " + a + " foi encontrado, digite sua nota: ");

                        nota = sc.nextDouble();
                        sc.nextLine();

                        notas.put(matricula, nota);
                    }else{
                        System.out.println("O(A) aluno(a) não foi encontrado(a)!");
                    }
                    break;
                case 3:
                    somaNotas = 0.0;
                    contadorNotas = 0;

                    for(String id: alunos.keySet()){
                        if(notas.containsKey(id)){
                            somaNotas += notas.get(id);
                            contadorNotas++;
                        }
                    }
                    if(contadorNotas > 0){
                        double media = somaNotas / contadorNotas;
                        System.out.println("A média das notas é: " + media);
                    }else{
                        System.out.println("Nenhuma nota registrada");
                    }
                    break;
                case 4:
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno(a) encontrado(a)!");
                    }else{
                        for(HashMap.Entry<String, Aluno> entry : alunos.entrySet()){
                            String matriculaAluno = entry.getKey();
                            Aluno alunoNome = entry.getValue();
                            Double notaAluno = notas.get(matriculaAluno);
                            if(notaAluno != null) {
                                System.out.println("Matrícula: " + matriculaAluno + ", Nome: " + alunoNome.getNome() + ", Nota: " + notaAluno);
                            }else{
                                System.out.println("Matrícula: " + matriculaAluno + ", Nome: " + alunoNome.getNome() + ", Nota: Não registrada.");
                            }
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

    static class Aluno{
        private String matricula;
        private String nome;
        private String cpf;

        public Aluno(String matricula, String nome, String cpf) {
            this.matricula = matricula;
            this.nome = nome;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return matricula.equals(((Aluno) o).getMatricula());
        }

        @Override
        public int hashCode() {
            return Objects.hash(matricula);
        }

        @Override
        public String toString(){
            return nome;
        }
    }
}
