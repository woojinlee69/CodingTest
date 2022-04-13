package programmersLv2;

public class programmersDecimal2 {
    //완전탐색이 효율적일듯
    public static int solution(String numbers){
        int answer = 0 ;
        int[] arr = new int[numbers.length()];
        for(int i = 0 ; i < numbers.length() ; i++){
            arr[i] = numbers.charAt(i) - '0';
        }
        for(int k = 0 ; k < arr.length ; k++) {
            System.out.println(arr[k]);
        }

        return answer;
    }
    public static void main(String[] args){
        String a = "17";
        System.out.println(solution(a));
    }
}
