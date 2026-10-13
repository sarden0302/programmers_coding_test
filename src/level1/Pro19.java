package level1;

public class Pro19 {
    public long solution(long n) {
        long answer = 0;
        long temp = 1;
        while (temp * temp <= n) {
            if (temp * temp == n) {
                answer = temp;
            }
            temp++;
        }

        return (answer != 0) ? (answer + 1) * (answer + 1) : -1;
    }
}
