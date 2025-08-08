import java.util.Scanner;
import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCharacters = scanner.nextInt();
        String word = scanner.next().toLowerCase();

        HashSet<Character> letters = new HashSet<>();

        for (int i = 0; i < numberOfCharacters; i++) {
            letters.add(word.charAt(i));
        }

        System.out.print(letters.size() == 26 ? "YES" : "NO");
    }
}