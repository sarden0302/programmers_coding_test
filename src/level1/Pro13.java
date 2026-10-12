package level1;

public class Pro13 {
    public int solution(int n) {
        int answer = 0;
        int temp = n;
        while (temp >= 10) {
            answer += temp % 10;
            temp /= 10;
        }

        answer += temp;
        return answer;
    }
}
