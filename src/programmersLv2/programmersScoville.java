package programmersLv2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class programmersScoville {
    public static int solution(int[] scoville, int k) {
        int answer = 0 ;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0 ; i < scoville.length ; i++)
            minHeap.add((scoville[i]));

        while( minHeap.peek() < k){
            int min1 = minHeap.poll();
            int min2 = minHeap.poll();

            minHeap.add( min1 + min2*2);
            answer++;

            if(minHeap.peek() >= k)
                break;
            if(minHeap.peek() < k && minHeap.size() == 1){
                answer = -1;
                break;
            }
        }
    return answer;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,9,10,12};
        int K = 7;
        System.out.println(solution(a,K));
    }
}
