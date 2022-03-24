package programmers;

public class programmersMeasure {
    public static int solution(int left, int right){
        int answer = 0 ;
        int count = 0 ;
        for(int i = left ; i <= right ; i++){
            for(int j = 1 ; j <= i ; j++){
                if(i % j == 0){
                    count++;
                }
            }//System.out.println(count);
            if(count % 2 == 0)
                answer += i;
            else answer -= i;
            count = 0;

        }
        return answer;
    }
    public static void main(String[] args){
        int a =13,b =17;
        System.out.println(solution(a,b));
    }
}
