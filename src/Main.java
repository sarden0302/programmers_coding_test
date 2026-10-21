import level2.Pro34;
import level2.Pro35;
import level2.Pro39;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pro39 pro39 = new Pro39();
        int[] pro39Answer = pro39.solution(3, 12);
        System.out.println("3, 12 -> lcm : " + pro39Answer[0] + ", gcd : " +  pro39Answer[1]);
        int[] pro39Answer2 = pro39.solution(1, 10);
        System.out.println("1, 10 -> lcm : " + pro39Answer2[0] + ", gcd : " +  pro39Answer2[1]);
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