import java.util.*;

public class ListaCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // quantidade de casos de teste

        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // consumir a quebra de linha após o número
            String listaCompras = scanner.nextLine();
            String[] itens = listaCompras.split(" ");

            Set<String> itensUnicos = new TreeSet<>(Arrays.asList(itens));

            for (String item : itensUnicos) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
