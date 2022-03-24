package gabiaCodingTest;

//배열 중 k개 이상 뽑아서 합이 11인 경우의 수
public class problem3 {
    public static int solution(int[] arr, int k, int t){
        int answer = 0;
        int tmp = 0 ;

        for(int i  = k ; i < arr.length ; i++) {
            int[] tmpArray = new int[i];
        }

        return answer;
    }
    private static boolean isAnswer(int tmp, int t){
        if(tmp == t) return true;
        return false;
    }
    public static void main(String[] args){
        int[] arr = {2,5,3,8,1};
        int k = 3;
        int t = 11;
        System.out.println(solution(arr, k, t));
    }
}
