package level1;

// 짝수의 합
public class Pro9 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            answer += i;
            i++;
        }
        return answer;
    }
}
