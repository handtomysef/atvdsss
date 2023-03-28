import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Pais implements Comparable<Pais> {
    String nome;
    int ouro, prata, bronze;

    public Pais(String nome, int ouro, int prata, int bronze) {

        this.nome = nome;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
    }

    public int compareTo(Pais outro) {

        if (this.ouro != outro.ouro) {
            return outro.ouro - this.ouro;
        } else if (this.prata != outro.prata) {
            return outro.prata - this.prata;
        } else if (this.bronze != outro.bronze) {
            return outro.bronze - this.bronze;
        } else {
            return this.nome.compareTo(outro.nome);
        }
    }

    public String toString() {
        return nome + " " + ouro + " " + prata + " " + bronze;
    }
}

public class QuadroMedalhas {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<Pais> paises = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String nome = sc.next();
                int ouro = sc.nextInt();
                int prata = sc.nextInt();
                int bronze = sc.nextInt();
                Pais pais = new Pais(nome, ouro, prata, bronze);
                paises.add(pais);
            }
            Collections.sort(paises);
            for (Pais pais : paises) {
                System.out.println(pais);
            }
        }
    }
}