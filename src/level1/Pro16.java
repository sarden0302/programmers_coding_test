package level1;

// x만큼 간격이 있는 n개의 숫자
public class Pro16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long value = x;

        for (int i = 0; i < n; i++) {
            answer[i] = value * (i + 1); // 또는 value += x 형태도 가능
        }

        return answer;
    }
}
