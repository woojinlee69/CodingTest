package programmersLv2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class programmersPocketmon {
    public static int solution(int[] nums){
        int answer = 0 ;
        int ea = nums.length/2;

        PriorityQueue pq = new PriorityQueue<>();

        for(int i = 0 ; i < nums.length ; i ++)
        {
            pq.add(nums[i]);
        }
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,3};
        solution(arr);
    }
}
