package level2;

public class Pro35 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }


        return (total - money < 0) ? 0 : total - money;
    }
}
