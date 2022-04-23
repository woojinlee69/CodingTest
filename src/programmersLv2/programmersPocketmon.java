package programmersLv2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class programmersPocketmon {
    public static int solution(int[] nums){
        int answer = 0 ;
        int ea = nums.length/2;

        PriorityQueue pq = new PriorityQueue<>();
        HashSet<Integer> hash = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i ++)
        {
            hash.add(nums[i]);
        }
        System.out.println(hash);
        int tmp = hash.size();

        if( ea > tmp ){
            answer = tmp;
        }else
            answer = ea;
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {3,3,3,2,2,4};
        solution(arr);
    }
}
