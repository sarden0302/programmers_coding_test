package level1;

// 자연수 뒤집어 배열로 만들기
public class Pro17 {
    public int[] solution(long n) {
        String s = "" + n;
        char[] list = new StringBuffer(s).reverse().toString().toCharArray();
        int[] answer = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            answer[i] = list[i] - '0';
        }

        return answer;
    }
}
