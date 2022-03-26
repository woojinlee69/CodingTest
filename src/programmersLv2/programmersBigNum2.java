package programmersLv2;

import java.util.Arrays;
import java.util.Comparator;

public class programmersBigNum2 {
    public static String solution(int[] numbers){
        String[] stringNumbers = new String[numbers.length];
        for(int i = 0 ; i < numbers.length ; i++){
            stringNumbers[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(stringNumbers, (o1,o2) -> (o2+o1).compareTo(o1+o2));

        if(stringNumbers[0].equals(0) && stringNumbers[1].equals(0)) return "0";
        String answer = "";
        for(String s: stringNumbers)
            answer += s;
        return answer;
    }
    public static void main(String[] args){
        int[] a = {3,30,34,5,9};
        System.out.println(solution(a));
    }
}
