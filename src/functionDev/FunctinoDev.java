package functionDev;

import java.util.ArrayList;
import java.util.List;

public class FunctinoDev {
    public static int[] solution(int[] progresses, int[] speeds){
        List<Integer> list = new ArrayList<>();
        int[] tmp = new int[progresses.length];

        for(int i = 0 ; i < progresses.length ; i++){
            tmp[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) / speeds[i] != 0)
                tmp[i] += 1;
        }

        int prev = tmp[0];
        int count =1 ;
        for( int i = 1 ; i < tmp.length ; i++){
            if( prev < tmp[i]){
                list.add(count);
                count =1 ;
                prev = tmp[i];
            }else
                count++;
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args){
        int[] pro = {95, 90, 99, 99, 80, 99};
        int[] spe = {1,1,1,1,1,1};
        int[] ans = new int[3];
        ans = solution(pro, spe);
        for(int i = 0 ; i < ans.length ; i++)
            System.out.println(ans[i]);

    }
}
