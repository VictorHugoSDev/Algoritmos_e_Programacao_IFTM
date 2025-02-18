/******************************************************************************

Escreva um programa que permita cadastrar com 5 nomes em um ArrayList tipado como String. 
Então o programa deverá imprimir os nomes enumerados com valores entre 1 e 5, exemplo:
Qual dos nomes abaixo você deseja excluir da lista?
1. Lucas Alvarenga
2. Carla Fragoso
3. João Sttifert
4. Yun Haito
5. Felicia Brum
Por fim, o usuário deverá informar um número entre 1 e 5. Feita a escolha do usuário pelo número correspondente ao nome, 
o programa deverá excluir o respectivo nome e mostrar na tela os quatro nomes que restaram cadastrados nalista


*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cadastrados = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String nome;
        int escolha;
        
        System.out.println("Digite os cinco nomes:");
        
        for(int i = 0; i < 5; i++){
            nome = scanner.nextLine();
            cadastrados.add(nome);
        }
        
        System.out.println("Qual dos nomes abaixo você deseja excluir da lista?");
        for(int i = 0; i < cadastrados.size(); i++){
            System.out.println(i+1 + ". " + cadastrados.get(i));
        }
        System.out.println("Informe o número correspondente ao nome a ser excluído:");
        
        escolha = scanner.nextInt();
        cadastrados.remove(escolha-1);
        
        int aux = 0;
        while(aux < cadastrados.size()){
            System.out.println(aux+1 + ". " + cadastrados.get(aux));
            aux++;
        }
        
        scanner.close();
       
    }
}
