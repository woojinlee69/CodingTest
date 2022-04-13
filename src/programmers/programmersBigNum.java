package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class programmersBigNum {
    public static String solution(String number, int k){
//        String answer = "";
//        int[] tmp = new int[number.length()];
//        ArrayList<Integer> list = new ArrayList();
//        for(int i = 0 ; i < number.length() ; i++) {
//            tmp[i] = number.charAt(i)-'0';
//            System.out.println(tmp[i]);
//        }
//        Arrays.sort(tmp);
//        for(int t = 0 ; t< tmp.length ;t++)
//        System.out.print(tmp[t]);
//        for(int j = tmp.length-1; j>=(tmp.length-k-1) ; j--){
//            list.add(tmp[j]);
//        }
//        answer = list.toString().replace(",","");
//        System.out.println(answer);
//        return answer;
        String answer ="";
        int[] tmp = new int[number.length()];
        int[] answerArr = new int[tmp.length-k];
        int idx = 0 ;
        int count = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < number.length() ; i++){
            tmp[i] = number.charAt(i) - '0';
        }
        for(int j = 0 ; j < k ; j ++){
            if(idx <= tmp[j]){
                idx = tmp[j];
                tmp[j] = 0 ;
                count++;
            }else if(idx > tmp[j]){
                list.add(idx);
                System.out.println(idx);
            }
        }


        for(int t = 0 ; t < tmp.length ; t++)
            System.out.print(tmp[t]);
        System.out.println(list);
        return answer;
    }
    public static void main(String[] args){
        String test = "1231234";
        int k = 3;
        System.out.println(solution(test, k));
    }
}
