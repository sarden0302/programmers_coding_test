package level3;

// 콜라 문제
public class Pro52 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            // 이번에 마트에서 받을 콜라 병 수
            int newCoke = (n / a) * b;

            // 교환하고 남은 빈 병 수 +새로 받은 콜라병(다 마시면 빈 병이 됨)
            n = (n % a) + newCoke;

            // 총 받은 콜라 수 누적
            answer += newCoke;
        }

        return answer;
    }
}
