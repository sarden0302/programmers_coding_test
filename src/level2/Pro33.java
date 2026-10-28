package level2;

// 약수의 개수와 덧셈
public class Pro33 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (numberOfFactors(i) % 2 == 0) {
                answer += i;
                System.out.println("answer is " + answer);
            } else {
                answer -= i;
                System.out.println("answer is " + answer);
            }
        }

        return answer;
    }

    public int numberOfFactors(int n) {
        int count = 0;
        System.out.println("#### " + n + "'s factors ####");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("i is " + i);
                count ++;
            }
        }
        System.out.println("#######################");
        return count;
    }
}
