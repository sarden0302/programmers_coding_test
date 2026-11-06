package level3;

import java.util.PriorityQueue;

public class Pro53 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);

            // 우선순위 큐의 크기가 k를 초과하면 가장 작은 값(최하위 점수)을 제거
            if (pq.size() > k) {
                pq.poll();
            }

            // 큐의 맨 앞에는 항상 현재 명예의 전당 중 최하위 점수가 위치함
            answer[i] = pq.peek();
        }

        return answer;
    }
}
