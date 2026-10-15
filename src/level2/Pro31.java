package level2;

public class Pro31 {
    public String solution(int n) {
        StringBuffer  sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("수");
            } else  {
                sb.append("박");
            }
        }

        return sb.toString();
    }
}
