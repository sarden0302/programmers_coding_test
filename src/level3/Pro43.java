package level3;

public class Pro43 {
    public int solution(String t, String p) {
        long pNum = Long.parseLong(p);
        int pLen = p.length();
        int count = 0;

        for (int i = 0; i <= t.length() - pLen; i++) {
            long subNum = Long.parseLong(t.substring(i, i + pLen));
            if (subNum <= pNum) {
                count++;
            }
        }
        return count;
    }
}
