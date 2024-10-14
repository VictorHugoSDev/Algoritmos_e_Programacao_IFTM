/******************************************************************************
Faça uma função recursiva em java, que dado um número inteiro positivo N, some todos os dígitos de N. 
Se o resultado da soma for maior que 9, a função deve continuar somando os dígitos desse novo número até 
que o resultado seja um único dígito. São dois processos que podem ser implementados de modo recursivo: 
somar os dígitos e repetir a soma desses dígitos. Pode implementar duas funções recursivas ou utilizar um While para uma delas.
Crie um programa que utilize a(s) função(es).

Dicas:
Você pode utilizar a operação de módulo (%) para obter o último dígito de um número e a operação de divisão inteira (/) 
para remover o último dígito.
A ideia principal é fazer a soma dos dígitos e, caso o resultado tenha mais de um dígito, 
chamar a função recursivamente com esse novo número.

Explicação: para o número N = 9875
9+8+7+5=29
2+9=11
1+1=2

Entrada
A entrada será composta por um número inteiro N.

Saída
Imprima o resultado da soma recursiva dos dígitos de N, que será sempre um número entre 1 e 9.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    int N = scanner.nextInt();
	    
		int soma = somarDigitos(N);
		int resultado = reduzirDigito(soma);
		System.out.println(resultado);
	}
	
	public static int somarDigitos(int N){
	    if (N == 0){
	        return 0;
	    }
	    return (N % 10) + somarDigitos(N / 10);
	}
	
	public static int reduzirDigito(int soma){
	    if(soma < 10){
	        return soma;
	    }
	    
	    return reduzirDigito(somarDigitos(soma));
	}
}
