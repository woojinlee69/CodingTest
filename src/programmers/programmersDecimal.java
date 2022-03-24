package programmers;

//배열에서 뽑아 소수 만들기
public class programmersDecimal {
    public static int solution( int[] nums){
        int answer = 0 ;
        int tmp = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i + 1 ; j < nums.length ; j++){
                for(int k = j + 1; k < nums.length ; k++){
                    tmp = nums[i] + nums[j] + nums[k];
                    if(isAnswer(tmp))
                        answer++;
                }
            }
        }
        return answer;
    }
    private static boolean isAnswer(int num){
        for(int i = 2 ; i < num ; i++)
            if( num % i == 0) return false;
        return true;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(solution(arr));
    }
}
