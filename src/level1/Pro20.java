package level1;

import java.util.Arrays;
import java.util.Collections;

public class Pro20 {
    public long solution(long n) {
        String[] stringList = Long.toString(n).split("");
        Arrays.sort(stringList, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for (String s : stringList) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
}
