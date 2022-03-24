package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class programmersDivisor {
    public static ArrayList solution(int[] arr, int divisor){
        ArrayList<Integer> list = new ArrayList<>();
        int[] a = {-1};
        int[] answer = {};
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(list.isEmpty())
            list.add(-1);

        return list;
    }
    public static void main(String[] args){
        int arr[] = {4,9,7,11};
        int divi = 5;
        System.out.println(solution(arr, divi));
    }
}
