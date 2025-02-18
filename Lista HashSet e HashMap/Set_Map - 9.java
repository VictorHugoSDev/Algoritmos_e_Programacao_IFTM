/*
Escreva um programa em Java que conte a frequência de cada letra em uma
string, ignorando espaços e diferenciando letras maiúsculas e minúsculas. Use um
HashMap<Character, Integer> para armazenar as contagens. (Similar ao exemplo
de contar ocorrência de números).
*/

import java.util.HashMap;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        HashMap<Character, Integer> contagem = new HashMap<>();
        HashMap<Character, Character> original = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        for (char c : frase.toCharArray()) {
            if (c != ' ') {
                char cLower = Character.toLowerCase(c);
                if (!original.containsKey(cLower)) {
                    original.put(cLower, c);
                }
                contagem.put(cLower, contagem.getOrDefault(cLower, 0) + 1);
            }
        }

        StringBuilder resposta = new StringBuilder();
        resposta.append("{");

        for (char c : contagem.keySet()) {
            int count = contagem.get(c);
            char originalChar = original.get(c);
            resposta.append(originalChar).append("=").append(count).append(", ");
        }

        if (resposta.length() > 1) {
            resposta.setLength(resposta.length() - 2);
        }

        resposta.append("}");

        System.out.println(resposta);

        sc.close();
    }
}
