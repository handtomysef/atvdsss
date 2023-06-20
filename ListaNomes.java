import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de nomes
        int n = Integer.parseInt(scanner.nextLine());

        // Criação de uma lista para armazenar os nomes
        List<String> nomes = new ArrayList<>();

        // Leitura dos nomes e adição à lista
        for (int i = 0; i < n; i++) {
            nomes.add(scanner.nextLine());
        }

        // Ordenação dos nomes por tamanho
        Collections.sort(nomes, Comparator.comparingInt(String::length));

        // Lista para armazenar os nomes por tamanho
        List<List<String>> nomesPorTamanho = new ArrayList<>();

        // Separação dos nomes por tamanho
        int tamanhoAnterior = -1;
        List<String> nomesDoTamanhoAtual = null;
        for (String nome : nomes) {
            int tamanho = nome.length();
            if (tamanho != tamanhoAnterior) {
                nomesDoTamanhoAtual = new ArrayList<>();
                nomesPorTamanho.add(nomesDoTamanhoAtual);
                tamanhoAnterior = tamanho;
            }
            nomesDoTamanhoAtual.add(nome);
        }

        // Impressão dos nomes ordenados por tamanho
        for (List<String> nomesDoTamanho : nomesPorTamanho) {
            for (String nome : nomesDoTamanho) {
                System.out.println(nome);
            }
        }
    }
}
