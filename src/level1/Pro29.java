package level1;

public class Pro29 {
    public int[] solution(int[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];

        int min_value = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min_value > arr[i]) {
                min_value = arr[i];
            }
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min_value) {
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}
