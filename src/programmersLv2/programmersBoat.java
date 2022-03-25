package programmersLv2;

import java.util.Arrays;

public class programmersBoat {
    public static int solution(int[] people, int limit){
//        int answer = 0 ;
//        int tmp = 0 ;
//        Arrays.sort(people);
//        for(int i = 0 ; i < people.length-1 ; i++){
//            tmp = limit - people[i];
//            if(tmp >= people[i+1]){
//                tmp -= people[i+1];
//            }else
//            {
//                answer++;
//                continue;
//            }
//        }
        //===================================================
//        int answer = 0 ;
//        int tmp = 0;
//        int idx = 0;
//        Arrays.sort(people);
//        for(int i = people.length-1 ; i >= 0 ; i --){
//            tmp = limit;
//            tmp = limit - people[i];
//            if( tmp >= people[idx]){
//                idx++;
//                answer++;
//                if(idx >= i) break;
//                break;
//            }else{
//                answer++;
//                continue;
//            }
//        }
//
        int answer = 0;
        int idx = 0 ;
        Arrays.sort(people);
        for(int i = people.length-1 ; i >= idx ; i--){
            if(people[idx] + people[i] <= limit ) idx++;
            answer++;
        }

        return answer;
    }
    public static void main(String[] args){
        int[] p = {70, 60, 80};
        int limit = 100;
        System.out.println(solution(p,limit));
    }
}
