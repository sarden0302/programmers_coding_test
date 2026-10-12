import level1.Pro28;
import level1.Pro29;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 6, 7, 8, 0};

        Pro28 pro28 = new Pro28();
        System.out.println(pro28.solution(ints));
    }

    public static void arrayanswer(int[] arr) {
        if (arr == null) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

    public String hello() {
        return "Hello Git";
    }
}