import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
            int resultado = calcularRestoFibonacci(N, M);
            System.out.println(resultado);
        }
    }

    public static int calcularRestoFibonacci(int N, int M) {
        int fibN = calcularFibonacci(N);
        int fibFibN = calcularFibonacci(fibN);
        
        return fibFibN % M;
    }

    public static int calcularFibonacci(int N) {
        if (N <= 2) {
            return 1;
        }
        
        int a = 1;
        int b = 1;
        
        for (int i = 3; i <= N; i++) {
            int temp = a;
            a = b;
            b = (temp + b) % 1000000; // Usamos % 1000000 para evitar estouro de inteiros
        }
        
        return b;
    }
}
