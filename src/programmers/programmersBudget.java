package programmers;

import java.util.Arrays;

public class programmersBudget {
    public static int solution(int[] d, int budget){
        int answer = 0 ;
        Arrays.sort(d);
        int tmp = 0;
//        for(int i = 0 ; i < d.length-1 ; i++){
//            if(budget > 0 && d[i+1] <= budget){
//                budget -= d[i];
//                answer++;
//                if(budget == d[i+1])
//                    answer+=1;
//            }else break;
//        }
        for(int i = 0 ; i < d.length ; i++){
            tmp += d[i];
            answer++;
            if(tmp > budget){
                answer --;
                break;
            }else continue;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution(arr, budget));
    }
}
