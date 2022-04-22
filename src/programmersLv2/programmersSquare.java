package programmersLv2;

public class programmersSquare {
    public static long solution(int w, int h){
        long answer = 1 ;

        if( w == h ){
            answer = (w*h) - w;
        }else{

        }

        return answer;
    }

    public static void main(String[] args){
        int w = 8;
        int h = 12;
        System.out.println(solution(w,h));
    }
}
