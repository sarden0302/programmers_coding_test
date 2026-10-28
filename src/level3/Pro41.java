package level3;

// 이상한 문자 만들기
public class Pro41 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0; // 단어별 인덱스 체크

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 공백일 경우 인덱스를 0으로 초기화하고 공백 그대로 추가
            if (c == ' ') {
                idx = 0;
                answer.append(c);
            } else {
                // 짝수 인덱스는 대문자, 홀수 인덱스는 소문자로 변환
                if (idx % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                idx++; // 다음 알파벳을 위해 인덱스 증가
            }
        }

        return answer.toString();
    }
}
