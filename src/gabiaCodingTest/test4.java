package gabiaCodingTest;

import java.util.ArrayList;

public class test4 {
    public static int solution(int[] estimates, int k){
        int answer = 0 ;
        int startPoint = 0 ;
        int tmp = 0 ;
        int[] tmp1 = new int[estimates.length];
        ArrayList<Integer> list = new ArrayList<>();

        while(startPoint+k+1 <= estimates.length-1){
            for(int i = startPoint ; i < startPoint+k-1 ; i++){
                tmp += estimates[i];
            }
            list.add(tmp);
            startPoint++;
            k++;
            System.out.println(list + " ");
        }

        return answer;
    }
    public static void main(String[] args){
        int[] arr = {5,1,9,8,10,5};
        int k =3 ;
        System.out.println(solution(arr, k));
    }
}
