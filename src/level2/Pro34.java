package level2;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class Pro34 {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuffer sb = new StringBuffer(new String(arr));
        String answer = sb.reverse().toString();

        return answer;
    }
}
