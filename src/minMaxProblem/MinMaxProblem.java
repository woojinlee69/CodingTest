package minMaxProblem;

import java.util.ArrayList;

public class MinMaxProblem {
    public static int[] solution(int[] numbers){
        ArrayList<Integer> answer = new ArrayList<>();
        int maxIdx = 0;
        int minInx = 0;
        int max = numbers[0];
        int min = numbers[0];
        int[] an = {};
        an = new int[answer.size()];
        for(int i = 1 ; i < numbers.length ; i++)
        {
            if( numbers[i] > max) {
                max = numbers[i];
                maxIdx = i+1;
            }
            if( numbers[i] < min) {
                min = numbers[i];
                minInx = i+1;
            }
        }
        answer.add(max);
        answer.add(maxIdx);
        answer.add(min);
        answer.add(minInx);
        an = new int[answer.size()];
        for(int i = 0 ; i < answer.size() ; i++)
            an[i] = answer.get(i);
        return an;
    }
    public static void main(String[] args){
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
        int[] answer = new int[4];
        answer = solution(numbers);
        for(int i =0 ; i < 4 ; i++){
            System.out.println(answer[i]);
        }
    }
}
