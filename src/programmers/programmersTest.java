package programmers;

import java.util.ArrayList;
import java.util.TreeSet;

public class programmersTest {
    public static Integer[] solution(int[] numbers){
        int tmp = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < numbers.length - 1  ; i++){
            for(int j = i+1 ; j < numbers.length  ; j++){
                tmp = numbers[i] + numbers[j];
                list.add(tmp);

            }
        }
        TreeSet<Integer> treeSet = new TreeSet<Integer>(list);
        Integer[] arr = treeSet.toArray(new Integer[0]);

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {2,1,3,4,1};
        System.out.println(solution(arr));
    }
}
