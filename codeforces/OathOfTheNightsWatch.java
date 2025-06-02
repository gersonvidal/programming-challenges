import java.util.Scanner;
import java.util.*;

public class OathOfTheNightsWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stewards = scanner.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < stewards; i++) {
            int stewardStrength = scanner.nextInt();
            map.put(stewardStrength, map.getOrDefault(stewardStrength, 0) + 1);
        }
        
        int currentStep = 1;
        int stewardsHelped = 0;
        for (Map.Entry<Integer, Integer> strengthCount : map.entrySet()) {
            if (currentStep == 1 || currentStep == map.size()) {
                currentStep++;
                continue;
            }
            stewardsHelped += strengthCount.getValue();
            currentStep++;
        }
        System.out.print(stewardsHelped);
    }
}