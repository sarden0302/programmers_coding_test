package level2;

// 최대공약수와 최소공배수
public class Pro39 {
    public int[] solution(int n, int m) {
            int[] answer = new int[2];

            answer[0] = gcd(n,m);
            answer[1] = (n*m)/answer[0];
            return answer;
        }

        public static int gcd(int p, int q)
        {
            if (q == 0) return p;
            return gcd(q, p%q);
        }
}
