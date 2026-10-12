package level1;

import java.util.Arrays;

public class Pro28 {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}
