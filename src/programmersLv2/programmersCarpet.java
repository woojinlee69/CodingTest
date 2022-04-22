package programmersLv2;
//Yellow 의 곱 경우의 수를 뽑고, (x+2)*2+2y 가 Brown 일 경우를 계산
// 경우의 수의 (x+2, y+2)를 출력

public class programmersCarpet {
    public static int[] solution(int brown, int yellow){
        int[] answer = {} ;
        answer = new int[2];
        for(int i = yellow ; i  > 0  ; i--) {
            if (yellow % i == 0) {
                int test = yellow / i;
                test = (i + 2) * 2 + test * 2;
                if (test == brown) {
                    answer[1] = i + 2;
                    answer[0] = yellow / i + 2;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int yellow = 24;
        int brown = 24;
        System.out.println(solution(brown, yellow));
    }
}
