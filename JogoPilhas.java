import java.util.Scanner;

public class JogoDasPilhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }
            
            int[][] pilhas = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    pilhas[i][j] = scanner.nextInt();
                }
            }
            
            boolean canWin = canWinGame(pilhas);
            System.out.println(canWin ? 1 : 0);
        }
        
        scanner.close();
    }
    
    private static boolean canWinGame(int[][] pilhas) {
        int[] sumModulo = new int[3];
        
        for (int i = 0; i < pilhas.length; i++) {
            for (int j = 0; j < 3; j++) {
                sumModulo[j] += pilhas[i][j];
            }
        }
        
        return canWinGameHelper(sumModulo);
    }
    
    private static boolean canWinGameHelper(int[] sumModulo) {
        int totalSumModulo = (sumModulo[0] + sumModulo[1] + sumModulo[2]) % 3;
        
        if (totalSumModulo != 0) {
            return false;
        }
        
        for (int i = 0; i < 3; i++) {
            if (sumModulo[i] % 3 == 0) {
                int[] newSumModulo = new int[3];
                System.arraycopy(sumModulo, 0, newSumModulo, 0, 3);
                
                newSumModulo[i] = 0;
                if (!canWinGameHelper(newSumModulo)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}