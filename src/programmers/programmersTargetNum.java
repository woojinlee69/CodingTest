package programmers;

public class programmersTargetNum {
    static int answer= 0;
    public static int solution(int[] numbers, int target){
        answer = 0;
        dfs(numbers,target,0,0);
        return answer;
    }
    public static void dfs(int[] numbers, int target, int depth, int sum){

        if( depth == numbers.length){
            if( sum == target) answer++;
            return;
        }
        sum += numbers[depth];
        dfs(numbers, target, depth+1, sum);
        sum -= numbers[depth];
        sum += (-1*numbers[depth]);
        dfs(numbers, target, depth+1, sum);
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,1,1};
        int t = 3;
        System.out.println(solution(arr, t));
    }
}
