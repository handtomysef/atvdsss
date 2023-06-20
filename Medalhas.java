import java.util.*;

class Pais implements Comparable<Pais> {
    String nome;
    int ouro;
    int prata;
    int bronze;

    public Pais(String nome, int ouro, int prata, int bronze) {
        this.nome = nome;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
    }

    public String getNome() {
        return nome;
    }

    public int getOuro() {
        return ouro;
    }

    public int getPrata() {
        return prata;
    }

    public int getBronze() {
        return bronze;
    }

    @Override
    public int compareTo(Pais outroPais) {
        if (this.ouro != outroPais.getOuro()) {
            return outroPais.getOuro() - this.ouro; // Ordena por medalhas de ouro (maior para menor)
        } else if (this.prata != outroPais.getPrata()) {
            return outroPais.getPrata() - this.prata; // Ordena por medalhas de prata (maior para menor)
        } else if (this.bronze != outroPais.getBronze()) {
            return outroPais.getBronze() - this.bronze; // Ordena por medalhas de bronze (maior para menor)
        } else {
            return this.nome.compareTo(outroPais.getNome()); // Ordena alfabeticamente
        }
    }
}

public class Medalhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPaises = scanner.nextInt();
        List<Pais> paises = new ArrayList<>();

        for (int i = 0; i < numPaises; i++) {
            String nome = scanner.next();
            int ouro = scanner.nextInt();
            int prata = scanner.nextInt();
            int bronze = scanner.nextInt();
            paises.add(new Pais(nome, ouro, prata, bronze));
        }

        Collections.sort(paises);

        for (Pais pais : paises) {
            System.out.println(pais.getNome() + " " + pais.getOuro() + " " + pais.getPrata() + " " + pais.getBronze());
        }

        scanner.close();
    }
}
