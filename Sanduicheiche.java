import java.util.Scanner;
import java.util.Scanner;

public class Sanduicheiche {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String palavra = scanner.next();
            String palavraCorrigida = corrigirPalavra(palavra);
            System.out.println(palavraCorrigida);
        }
    }

    public static String corrigirPalavra(String palavra) {
        int tamanho = palavra.length();
        String parteRepetida = palavra.substring(tamanho / 2);
        String palavraCorrigida = palavra.substring(0, tamanho / 2);
        return palavraCorrigida + parteRepetida;
    }
}
