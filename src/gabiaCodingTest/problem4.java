package gabiaCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class problem4 {
    public static int solution(int[] estimates, int k){
        int answer = 0 ;
        int startPoint = 0;
        int tmp = 0 ;
        int[] tmp1 = new int[estimates.length];
        ArrayList<Integer> list = new ArrayList<>();

        while(startPoint <= estimates.length-k+1){
            int endPoint = startPoint + k -1;
            for (int i = startPoint ; i < endPoint+1; i++) {
                if(i >= estimates.length) break;
                tmp = tmp + estimates[i];

            }
            list.add(tmp);
            startPoint++;
            tmp = 0 ;

            System.out.println(list + " ");
        }
        Collections.sort(list, Collections.reverseOrder());
        return list.get(0);
    }
    public static void main(String[] args){
        int[] arr = {5,1,9,8,10,5};
        int k =3 ;
        System.out.println(solution(arr, k));
    }
}