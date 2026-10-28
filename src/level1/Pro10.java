package level1;

// 배열의 평균값
public class Pro10 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i : numbers) {
            answer += i;
        }
        return answer/(numbers.length);
    }
}
