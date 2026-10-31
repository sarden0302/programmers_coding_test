package level3;

import java.util.ArrayList;

public class Pro49 {
    // 두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0 ; i < numbers.length - 1; i++) {
            for (int j = i + 1 ; j < numbers.length; j++) {
                int temp = Math.abs(numbers[i] + numbers[j]);
                if (!uniqueList.contains(temp)) {
                    uniqueList.add(temp);
                }
            }
        }

        return uniqueList.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
