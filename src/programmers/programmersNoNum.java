package programmers;

import java.util.ArrayList;

public class programmersNoNum {
    public static int solutioin(int[] numbers){
        int answer = 0 ;
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int k =0 ; k < 10 ; k ++)
            list.add(k);
        for(int j = 0; j < numbers.length ; j++){
            for( int i = 0; i < 10 ; i++ ){
                if( numbers[j] == list.indexOf(i)){
                    list.set(i, 0);
                    System.out.println(list);
                }else
                    continue;
            }
        }

        for(int i = 0 ; i < list.size() ; i++)
            answer += list.get(i);
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,7,8,0};
        System.out.println(solutioin(arr));
    }
}
