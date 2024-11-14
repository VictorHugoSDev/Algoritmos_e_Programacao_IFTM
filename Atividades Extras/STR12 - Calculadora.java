/******************************************************************************
Faça um programa que receba uma frase (utilize nextLine()) contendo uma formula matemática, 
contendo dois números e um operador, exemplo: "342.40+45.3". Baseado na String fornecida resolva a fórmula matemática. 
Caso a frase seja inválida(não tenha dois números ou um dos operadores) imprimir 'Formula invalida.'.

obs.:
- haverá espaços entre os números e o operador (facilita o split), senão houver dará "Formula invalida.".

- Utiliza o tipo double. Para converter um texto em double (Double.parseDouble(texto)).

- Obrigatório realizar a leitura da fórmula com nextLine()

Entrada
Uma String contendo uma fórmula matemática

Saída
Imprimir o resultado do cálculo

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String formula = scanner.nextLine();
        
        String [] formulaDivida = formula.split(" ");
        
        if(formulaDivida.length != 3){
            System.out.println("Formula invalida.");
            return;
        }
        
        try{
            double numero1 = Double.parseDouble(formulaDivida[0]);
            double numero2 = Double.parseDouble(formulaDivida[2]);
            
            String operador = formulaDivida[1];
            
            double resultado = 0;
            
            switch(operador){
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if(numero2 == 0){
                        System.out.println("O divisor não pode ser 0.");
                        return;
                    }
                    
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Formula invalida.");
                    return;
            }
            
            System.out.println(resultado);
            
        } catch(NumberFormatException e) {
            System.out.println("Formula invalida.");
        }
        
        scanner.close();
    }
}
