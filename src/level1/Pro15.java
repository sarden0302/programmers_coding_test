package level1;

public class Pro15 {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return n;
    }
}
