import java.util.Scanner;

public class NewPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int character = 97; 

        for (int i = 0; i < n; i++) {
            System.out.print((char) character);
            character++; // Go to next character

            // If k = 4, then 97 + k = 101
            // 101 = 'e'
            // k = 4, then our only characters available to use are 'a', 'b', 'c', and 'd' (97 to 100)
            // We shouldn't go beyond 'd' (100) in this case, so when we hit 101, we return to 'a' (97) 
            // If we haven't gone beyond 'd' for example, we continue with the next character and don't change the variable
            character = character == 97 + k ? 97 : character;
        }
    }
}