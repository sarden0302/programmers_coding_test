package level2;

import java.util.stream.IntStream;

// 내적
public class Pro32 {
    class Solution {
        public int solution(int[] a, int[] b) {
            return IntStream.range(0, a.length).map(i -> a[i] + b[i]).sum();
        }
    }
}
