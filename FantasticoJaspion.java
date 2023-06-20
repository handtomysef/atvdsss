import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FantasticoJaspion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInstancias = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInstancias; i++) {
            int numPalavrasDic = scanner.nextInt();
            int numLinhasLetra = scanner.nextInt();
            scanner.nextLine();

            Map<String, String> dicionario = new HashMap<>();
            for (int j = 0; j < numPalavrasDic; j++) {
                String palavraJaponesa = scanner.nextLine();
                String traducao = scanner.nextLine();
                dicionario.put(palavraJaponesa, traducao);
            }

            for (int j = 0; j < numLinhasLetra; j++) {
                String linha = scanner.nextLine();
                String[] palavras = linha.split(" ");
                String traducaoLinha = "";

                for (String palavra : palavras) {
                    String traducaoPalavra = dicionario.get(palavra);
                    if (traducaoPalavra != null) {
                        traducaoLinha += traducaoPalavra + " ";
                    } else {
                        traducaoLinha += palavra + " ";
                    }
                }

                System.out.println(traducaoLinha.trim());
            }

            System.out.println();
        }
    }
}
