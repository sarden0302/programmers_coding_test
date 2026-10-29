package level3;

import java.util.ArrayList;
import java.util.Arrays;

// K번째 수 정렬
public class Pro48 {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int[] command : commands) {
            int[] subArr = Arrays.stream(Arrays.copyOfRange(array, command[0] - 1, command[1])).sorted().toArray();
            for (int sa : subArr) {
                System.out.print(sa);
            }
            System.out.println();
            if (subArr.length > command[2]) {
                arrayList.add(subArr[command[2] - 1]);
            } else if (subArr.length != 0){
                arrayList.add(subArr[0]);
            }

        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
