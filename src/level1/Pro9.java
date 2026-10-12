package level1;

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
