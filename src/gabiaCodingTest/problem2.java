package gabiaCodingTest;

import java.util.ArrayList;

public class problem2 {
    public static int solution(String p){
        int answer = 0 ;
        int position = 0;
        int count = 0;
        boolean[] visited = new boolean[p.length()];
        char[] arr = new char[p.length()];

        while(position <= p.length()){
            for(int i = 0 ; i < p.length() || i < 0 ; i++){
                if( p.charAt(i) == '>'){
                    i = i+1;
                    count++;
                }else {
                    i = i - 1;
                    count++;
                }
        }}
        return count;
    }
    public static void main(String[] args){
        String p = "<<<><";
        System.out.println(p.length());
        System.out.println(solution(p));
    }
}
