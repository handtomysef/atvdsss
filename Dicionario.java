import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class DicionarioAndy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> palavrasSet = new HashSet<>();

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] palavrasLinha = linha.split("\\W+");
            for (String palavra : palavrasLinha) {
                if (!palavra.isEmpty()) {
                    palavrasSet.add(palavra.toLowerCase());
                }
            }
        }

        ArrayList<String> palavrasList = new ArrayList<>(palavrasSet);
        Collections.sort(palavrasList);

        for (String palavra : palavrasList) {
            System.out.println(palavra);
        }
    }
}