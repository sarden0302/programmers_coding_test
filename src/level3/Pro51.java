package level3;

// 푸드 파이트 대회
public class Pro51 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1 ; i < food.length ; i++) {
            int count = food[i] / 2;
            for (int j = 1 ; j <= count ; j++) {
                sb.append(i);
            }
        }

        return sb.toString() + "0" + sb.reverse().toString();
    }
}
