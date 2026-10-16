import level1.Pro16;
import level1.Pro28;
import level1.Pro29;
import level1.Pro9;
import level2.Pro32;
import level2.Pro33;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pro33 pro33 = new Pro33();
        int answer33 = pro33.solution(24, 27);
        System.out.println("answer33 is " + answer33);
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
}