package level1;

// 평균 구하기
public class Pro12 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int a : arr) {
            answer += a;
        }
        return answer / arr.length;
    }
}
