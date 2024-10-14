import java.util.Scanner;

public class Main
{
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    int N = s.nextInt();
    
    long total = fatorial(N);
    
    System.out.println(total);
    
    }
    
    public static long fatorial(int N){
        if(N == 0 || N == 1){
            return 1;
        }
        return N * fatorial(N - 1);
    }
}
