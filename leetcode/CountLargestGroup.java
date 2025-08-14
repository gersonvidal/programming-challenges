import java.util.HashMap;

class CountLargestGroup {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFrequencyRegistered = Integer.MIN_VALUE;
        int groupCount = 0;

        for (int number = 1; number <= n; number++) {
            int aux = number;
            int digitSum = 0;

            while (aux > 0) {
                digitSum += aux % 10;
                aux /= 10;
            }

            map.merge(digitSum, 1, Integer::sum);

            maxFrequencyRegistered = Math.max(map.get(digitSum), maxFrequencyRegistered);
        }

        for (Integer groupFrequency : map.values()) {
            if (groupFrequency == maxFrequencyRegistered)
                groupCount++;
        }
        return groupCount;
    }
}