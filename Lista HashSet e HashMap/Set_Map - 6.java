/* Escreva um programa em Java que recebe uma lista de números inteiros do
usuário e então armazena esses números e a quantidade de ocorrências em um
HashMAP<Integer, Integer> para armazenar o número como chave e a contagem de
repetições como valor.
● Crie um HashMAP para armazenar a dupla<Número, Ocorrências>.
● Entre com diversos números até digitar um valor negativo.
● Verifique se o número existe como chave e aumente o valor correspondente
a chave(número). Caso não exista, crie um novo elemento no Mapa.
● Ao fim imprima o conteúdo do mapa conforme exemplo abaixo.*/

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Integer> contagemNumeros = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            int numero = sc.nextInt();

            if(numero < 0){
                break;
            }

            if(contagemNumeros.containsKey(numero)){
                contagemNumeros.put(numero, contagemNumeros.get(numero)+1);
            }else{
                contagemNumeros.put(numero, 1);
            }
        }

        for(HashMap.Entry<Integer, Integer> entry : contagemNumeros.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }
}
