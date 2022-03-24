package programmers;

public class programmersMinus {
    public static int solution(int[] absolutes, boolean[] signs){
        int answer = 0 ;
        for(int i = 0 ; i < absolutes.length ; i++){
            if(signs[i] == false)
                absolutes[i] = -absolutes[i];
            answer += absolutes[i];
        }
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {4,7,12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(arr,signs));
    }
}
