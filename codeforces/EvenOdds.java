import java.util.Scanner;

public class EvenOdds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long guideNumber = scanner.nextLong(), askedPosition = scanner.nextLong();

		long quantityOfOdds = (long) Math.ceil(guideNumber / 2.0);

		System.out.print(askedPosition <= quantityOfOdds ? 1 + (askedPosition - 1) * 2 : 2 + ((askedPosition - quantityOfOdds) - 1) * 2);

	}
}