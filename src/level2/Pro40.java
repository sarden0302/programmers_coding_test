package level2;

public class Pro40 {
    public int solution(int n) {
        // 1. n을 3진법 문자열로 변환 (역순으로 들어감)
        String tenary = Integer.toString(n, 3);

        // 2. 문자열 뒤집기
        String reversed = new StringBuilder(tenary).reverse().toString();

        return Integer.parseInt(reversed, 3);
    }
}
