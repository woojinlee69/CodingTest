package programmers;

import java.util.stream.*;

public class ProgrammersSort {
//    public String solution(int[] numbers){
//        // 숫자 -> 문자 -> 내림차순 -> 조합
//        String answer = IntStream.of(numbers)
//                .mapToObj(String::valueOf)
//                .sorted((s1,s2) -> (s2+s1).compareTo(s1+s2))
//                .collect(Collectors.joining());
//
//        if(answer.startsWith("0")) return "0";
//        return answer;
//    }
    public static String solution(int[] numbers){
//        String answer = "";
//        String[] strNums = new String[numbers.length];
//        for(int i = 0 ; i < numbers.length ; i++){
//            strNums[i] = ""+numbers[i];
//        }
//        Arrays.sort(strNums, (o1, o2) -> (o2+o1).compareTo(o1+o2));
//
//        for(String s : strNums)
//            answer += s;
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf) // (n) -> String.valueOf(n)
                .sorted((s1,s2) -> (s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());

        if(answer.startsWith("0")) return "0";
        return answer;
    }
    public static void main(String[] args){
        int[] nums = {6, 10, 2};
        System.out.println(solution(nums));
    }
}
