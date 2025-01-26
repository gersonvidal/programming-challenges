import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnets = scanner.nextInt();
        int counter = 1; 

        // Read the order of the magnets
        // For example: ["10", "10," "01"], each String is a magnet
        // 1 means negative pole and 0 means positive pole 
        String[] magnetPositions = new String[magnets];
        for (int i = 0; i < magnetPositions.length; i++) {
            magnetPositions[i] = scanner.next();
        }

        // Now check magnet by magnet
        for (int i = 0; i < magnetPositions.length - 1; i++) {
            // Check if second pole of ith magnet is equal to the first pole of next magnet
            // If they are equal that means another group of magnets is created
            if (magnetPositions[i].charAt(1) == magnetPositions[i + 1].charAt(0)) {
                counter++;
            }
        }
        
        System.out.print(counter);
    }
}