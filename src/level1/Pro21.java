package level1;

// 하샤드 수
public class Pro21 {
    public boolean solution(int x) {
        int answer = 0;
        String[] array = String.valueOf(x).split("");
        for(String s : array){
            answer += Integer.parseInt(s);
        }
        return (x % answer) == 0 ? true : false;
    }
}
