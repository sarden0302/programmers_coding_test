package level1;

// 핸드폰 번호 가리기
public class Pro27 {
    public String solution(String phone_number) {
        int size = phone_number.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size-4; i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(size-4, size));
        return sb.toString();
    }
}
