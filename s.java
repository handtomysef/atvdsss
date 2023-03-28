import java.util.Scanner;

public class sobrenomenaoefacil {

    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)) {
            while (ler.hasNext()) {

                String sobrenome = ler.nextLine();
                char[] letras = sobrenome.toCharArray();
                boolean dificil = false;
                int contConsoantesSeguidas = 0;
                int contConsoantesTemp = 0;
                char ultimaLetra = letras[0];

                for (char letra : letras) {
                    if (Character.isLetter(letra) && (!isVogal(letra))) {
                        if ((!isVogal(ultimaLetra))) {
                            contConsoantesTemp++;
                        } else {
                            contConsoantesTemp = 1;
                        }

                    } else {
                        contConsoantesTemp = 0;
                    }
                    if (contConsoantesTemp >= 3) {
                        dificil = true;
                        break;
                    }

                    if (contConsoantesTemp > contConsoantesSeguidas) {
                        contConsoantesSeguidas = contConsoantesTemp;
                    }

                    ultimaLetra = letra;

                }
                if (dificil == true) {
                    System.out.println(sobrenome + " nao eh facil");

                } else {
                    System.out.println(sobrenome + " eh facil");
                }

            }
        }

    }

    public static boolean isVogal(char letra) {
        char letraMin = Character.toLowerCase(letra);
        return letraMin == 'a' || letraMin == 'e' || letraMin == 'i' || letraMin == 'o' || letraMin == 'u';
    }
}
