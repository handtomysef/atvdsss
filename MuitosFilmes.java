import java.util.Scanner;

public class MuitosFilmes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int anos = input.nextInt();
        input.nextLine(); // Limpar o buffer
        
        int[] errosPorCategoria = new int[4]; // Array para armazenar os erros por categoria
        
        for (int i = 0; i < anos; i++) {
            input.nextLine(); // Descartar "Suposições"
            
            String[] palpites = new String[4];
            for (int j = 0; j < 4; j++) {
                palpites[j] = input.nextLine();
            }
            
            input.nextLine(); // Descartar "Vencedores"
            
            String[] vencedores = new String[4];
            for (int j = 0; j < 4; j++) {
                vencedores[j] = input.nextLine();
            }
            
            // Verificar os palpites e incrementar o contador de erros por categoria
            for (int j = 0; j < 4; j++) {
                if (!palpites[j].equals(vencedores[j])) {
                    errosPorCategoria[j]++;
                }
            }
        }
        
        // Encontrar as categorias com maior número de erros
        int maxErros = 0;
        for (int i = 0; i < 4; i++) {
            if (errosPorCategoria[i] > maxErros) {
                maxErros = errosPorCategoria[i];
            }
        }
        
        // Imprimir as categorias com maior número de erros
        for (int i = 0; i < 4; i++) {
            if (errosPorCategoria[i] == maxErros) {
                System.out.print((i + 1) + " ");
            }
        }
        
        input.close();
    }
}
