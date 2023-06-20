import java.util.*;

public class HallAssassinos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> assassinos = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] nomes = linha.split(" ");

            String assassino = nomes[0];
            String assassinado = nomes[1];

            if (!assassinos.containsKey(assassino)) {
                assassinos.put(assassino, 0);
            }
            assassinos.put(assassino, assassinos.get(assassino) + 1);

            assassinos.remove(assassinado);
        }

        System.out.println("HALL OF MURDERERS");

        for (Map.Entry<String, Integer> entry : assassinos.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
