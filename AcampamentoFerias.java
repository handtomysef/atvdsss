import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  AcampamentoFerias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(); // quantidade de crianças no círculo
            if (n == 0) {
                break; // fim da entrada
            }

            scanner.nextLine(); // limpar o buffer

            List<Crianca> criancas = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] info = scanner.nextLine().split(" ");
                String nome = info[0];
                int valor = Integer.parseInt(info[1]);
                criancas.add(new Crianca(nome, valor));
            }

            if (n == 1) {
                System.out.println("Vencedor(a): " + criancas.get(0).getNome());
                continue;
            }

            int index = 0;
            while (criancas.size() > 1) {
                int valor = criancas.get(index).getValor();
                if (valor % 2 == 0) {
                    index = (index + valor - 1) % criancas.size();
                } else {
                    index = (index - valor + criancas.size()) % criancas.size();
                }
                criancas.remove(index);
                if (index == criancas.size()) {
                    index = 0;
                }
            }

            System.out.println("Vencedor(a): " + criancas.get(0).getNome());
        }
    }

    static class Crianca {
        private String nome;
        private int valor;

        public Crianca(String nome, int valor) {
            this.nome = nome;
            this.valor = valor;
        }

        public String getNome() {
            return nome;
        }

        public int getValor() {
            return valor;
        }
    }
}
