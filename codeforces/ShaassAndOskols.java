import java.util.Scanner;

public class ShaassAndOskols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWires = scanner.nextInt();
        // Cada posición del arreglo representa el número de pájaros en tal cable
        int[] birdsPerWire = new int[numberOfWires];

        for (int i = 0; i < numberOfWires; i++) {
            birdsPerWire[i] = scanner.nextInt();
        }

        int cocotazos = scanner.nextInt();

        for (int i = 1; i <= cocotazos; i++) {
            // Los cables nos los envían enumerados del 1 al 5
            // Aquí solamente traducimos a posición del arreglo restando uno, porque los arreglos empiezan en 0
            // El cable 1 sería la posición 0 (1 - 1 = 0), cable 5 sería la posición 4 (5 - 1 = 4)
            int wireAffected = scanner.nextInt() - 1;
            int birdAffected = scanner.nextInt();

            if (wireAffected != 0) {
                birdsPerWire[wireAffected - 1] += birdAffected - 1;
            }

            if (wireAffected != numberOfWires - 1) {
                // Nos da la cantidad de pájaros a la derecha del pájaro afectado
                // 10 - 6 = 4. Son 4 a la derecha del afectado
                // Es decir, los pájaros 7, 8, 9 y 10
                birdsPerWire[wireAffected + 1] += birdsPerWire[wireAffected] - birdAffected;
            }
            birdsPerWire[wireAffected] = 0;
        }

        for (int i = 0; i < numberOfWires; i++) {
            System.out.println(birdsPerWire[i]);
        }
    }
}