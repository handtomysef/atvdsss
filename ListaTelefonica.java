import java.util.Scanner;

public class ListaTelefonica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt(); // número de telefones na lista
            scanner.nextLine(); // limpar o buffer

            String[] telefones = new String[n];
            for (int i = 0; i < n; i++) {
                telefones[i] = scanner.nextLine();
            }

            int economiaTotal = 0;
            for (int i = 1; i < n; i++) {
                String telefoneAtual = telefones[i];
                String telefoneAnterior = telefones[i - 1];

                int economiaParcial = calcularEconomia(telefoneAtual, telefoneAnterior);
                economiaTotal += economiaParcial;
            }

            System.out.println(economiaTotal);
        }
    }

    private static int calcularEconomia(String telefoneAtual, String telefoneAnterior) {
        int economia = 0;

        for (int i = 0; i < telefoneAtual.length(); i++) {
            if (telefoneAtual.charAt(i) == telefoneAnterior.charAt(i)) {
                economia++;
            } else {
                break;
            }
        }

        return economia;
    }
}


