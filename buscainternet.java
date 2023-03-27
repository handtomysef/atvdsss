
import java.util.Scanner;

class buscainternet {

    public static int clickPrimeiro(int index) {
        return index * 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = new String[1000];
        int i = 0;
        while (sc.hasNext()) {
            entrada[i] = sc.nextLine();
            i++;
        }
        for (int j = 0; j < i; j++) {

            System.out.println(clickPrimeiro(Integer.parseInt(entrada[j])));
        }
        sc.close();
    }
}

