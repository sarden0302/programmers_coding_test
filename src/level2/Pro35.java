package level2;

// 부족한 금액 계산하기
public class Pro35 {
    public long solution(int price, int money, int count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
