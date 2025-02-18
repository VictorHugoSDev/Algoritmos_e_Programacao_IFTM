/******************************************************************************

Crie uma classe Aluno com os atributos matricula (String) e nome (String). 
Sobrescreva os métodos equals() e hashCode() para considerar dois alunos iguais se possuírem a mesma matrícula. 
Em seguida, crie um programa em Java (Main) que contenha um HashSet<Aluno> e adicione vários alunos, 
incluindo alguns com a mesma matrícula. 
Imprima a Lista de Alunos, não deve haver alunos com matrículas iguais.  
Pare a entrada de dados quando a matricula for igual a 0 
(Obrigatório o uso de HashSet)

*******************************************************************************/
import java.util.Objects;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> alunos = new LinkedHashSet<>();
        
        Scanner scanner = new Scanner(System.in);
        
        String matricula;
        String nome;
        
        while(true){
            System.out.println("Por favor, digite a matricula (Digite 0 para sair)!");
            matricula = scanner.nextLine();
            
            if(matricula.equals("0")){
                break;
            }
            
            if(!matriculaValida(matricula)){
                System.out.println("Por favor, digite uma matricula válida!");
            }
            else{
                System.out.println("Por favor, digite o nome do aluno: ");
                nome = scanner.nextLine();
                
                alunos.add(new Aluno(matricula, nome));
            }
        }
        
        System.out.println("Alunos: ");
        for(Aluno aluno: alunos){
            System.out.println(aluno);
        }
        
        scanner.close();
    
    }
    
    public static boolean matriculaValida(String matricula){
        if(matricula.isEmpty()){
            return false;
        }
        
        try{
            int matriculaNumero = Integer.parseInt(matricula);
            return matriculaNumero >= 0;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    static class Aluno{
        private String matricula;
        private String nome;
        
        public Aluno(String matricula, String nome){
            this.matricula = matricula;
            this.nome = nome;
        }
        
        public String getMatricula(){
            return matricula;
        }
        
        public void setMatricula(String matricula){
            this.matricula = matricula;
        }
        
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
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
