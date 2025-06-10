import java.util.Scanner;
 
public class Presents {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
                int numberOfFriends = scanner.nextInt();
                int[] reversedArray = new int[numberOfFriends];
                
                for (int index = 0; index < numberOfFriends; index++) {
                        int friendNumber = scanner.nextInt();
                        reversedArray[friendNumber - 1] = index + 1;
                }
                
                for (int i = 0; i < numberOfFriends; i++) {
                    System.out.print(reversedArray[i] + " ");
                }
        }
}