package programmersLv2;

import java.util.Collections;
import java.util.PriorityQueue;

// 우선순위 큐를 통해 소팅하고 하나씩 poll하면서 index와 value가 맞는지 확인
// answer count
public class programmersPrinter {
    public static int solution(int[] properties, int location){
        int answer = 0 ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < properties.length ; i++){
            pq.add(properties[i]);
        }
        while(!pq.isEmpty()){
            for(int i = 0; i < properties.length ; i++){
                if(properties[i] == pq.peek()){
                    if( i == location){
                        answer++;
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int[] test = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(test,location));
    }
}
