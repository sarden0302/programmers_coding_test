package level1;

// 가운데 글자 가져오기
public class Pro30 {
    public String solution(String s) {
        int length = s.length();

        if (length % 2 == 1) {
            return s.substring(length / 2, length / 2 + 1);
        } else {
            return s.substring((length / 2) - 1, (length / 2) + 1);
        }
    }
}
