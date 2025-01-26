import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shovelPrice = scanner.nextInt();
        int coinValue = scanner.nextInt();
        int counter = 0;
        int moneyCollected = 0; // max amount of money we can get if we do 10 + 10 + 10 + 10...

        do {
            counter++;
            moneyCollected = (counter * shovelPrice / 10) * 10; // round down the result to get an integer quotient
        
        // check if we can pay with only the money collected (10 + 10 + 10...) or we need to add the extra coin to the money collected
        // repeat while any of the 2 cases doesn't give an exact change
        } while ((shovelPrice * counter - moneyCollected != 0) && 
                 (shovelPrice * counter - (moneyCollected + coinValue) != 0)); 

        System.out.print(counter);
    }
}