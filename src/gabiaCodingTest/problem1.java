package gabiaCodingTest;

import java.util.Scanner;

public class problem1 {
    public static int solution(int mod1, int mod2, int max_range){
        int answer = 0 ;
        int[] tmp = new int[max_range+1];


        for(int i = 1 ; i <= max_range ; i++) {
            if ( i % mod1 == 0 && i % mod2 != 0){
                answer++;
            }
        }

//        for(int i = 1 ; i < max_range+1 ; i++){
//            if( i % mod1 == 0) {
//                tmp[i] = i;
//            }
//        }
//        for(int j = 0 ; j < tmp.length ; j++){
//            if( tmp[j] % mod2 != 0) {
//                answer++;
//            }
//        }
        return answer;
    }
    public static void main(String[] args){
        int mod1 = 4;
        int mod2 = 3;
        int max_range = 20;
        System.out.println(solution(mod1, mod2, max_range));

    }
}
