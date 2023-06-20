import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int m = scanner.nextInt();
            int c = scanner.nextInt();
            List<List<Integer>> table = new ArrayList<>();
            
            // Inicializa a tabela hash com listas vazias
            for (int j = 0; j < m; j++) {
                table.add(new ArrayList<>());
            }
            
            // Insere as chaves na tabela hash
            for (int j = 0; j < c; j++) {
                int key = scanner.nextInt();
                int address = hashFunction(key, m);
                table.get(address).add(key);
            }
            
            // Imprime a tabela hash
            for (int j = 0; j < m; j++) {
                System.out.print(j + " -> ");
                for (int key : table.get(j)) {
                    System.out.print(key + " -> ");
                }
                System.out.println("\\");
            }
            
            if (i < numCases - 1) {
                System.out.println();
            }
        }
        
        scanner.close();
    }
    
    // Função de espalhamento utilizando o operador de módulo
    private static int hashFunction(int key, int m) {
        return key % m;
    }
}
