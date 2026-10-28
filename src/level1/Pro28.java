package level1;

import java.util.Arrays;

// 없는 숫자 더하기
public class Pro28 {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}
