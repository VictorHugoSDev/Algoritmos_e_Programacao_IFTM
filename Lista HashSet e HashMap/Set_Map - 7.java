/* Faça um programa em Java que preenche um HashMap<String, Integer> e
então inverte as chaves e os valores. Vamos assumir que o usuário não irá digitar
valores repetidos(podem validar, mas não é obrigatório). Use um novo
HashMap<Integer, String> para armazenar o resultado.
a) Crie um HashMap para armazenar a dupla<String, Integer>.
b) Entre com diversas duplas de valores String e Integer e adicionem no
HashMap. Até  digitar a palavra Fim
c) Crie um novo HashMap para armazenar a dupla<Integer, String>
d) Copie os elementos do primeiro HashMap invertendo os valores.
e) Ao fim imprima o conteúdo do mapa conforme exemplo abaixo. */

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> texto = new HashMap<>();
        HashMap<Integer, String> inversao = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            String letraNum = sc.nextLine();
            if(letraNum.equals("Fim")) {
                break;
            }

            String [] partes = letraNum.split(" ");
            if(partes.length != 2) {
                System.out.println("Digite letra e número");
                continue;
            }

            String letra = partes[0];
            int numero = Integer.parseInt(partes[1]);

            texto.put(letra, numero);
        }

        for(HashMap.Entry<String, Integer> entry : texto.entrySet()){
            inversao.put(entry.getValue(), entry.getKey());
        }

        StringBuilder resposta = new StringBuilder("{");
        for (HashMap.Entry<Integer, String> entry : inversao.entrySet()) {
            resposta.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        }

        if (resposta.length() > 1) {
            resposta.setLength(resposta.length() - 2);
        }

        resposta.append("}");

        System.out.println(resposta);

        sc.close();
    }
}
