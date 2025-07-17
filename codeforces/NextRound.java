import java.util.Scanner;
 
public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int winnerCounter = 0;
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if ((scores[i] >= scores[k - 1]) && (scores[i] > 0)) {
                winnerCounter++;
            }
        }
        System.out.print(winnerCounter);
    }
}
