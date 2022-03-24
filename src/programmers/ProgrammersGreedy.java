package programmers;

public class ProgrammersGreedy {
    public int solution(int n, int[] stations, int w){
        int answer = 0; //기지국의 개수

        //Queue<Integer> sq = new LinkedList<>();
        //for(int i: stations) sq.offer(i);
        int si = 0;

        int position =1;
        while(position <= n){
            if(si < stations.length && stations[si] - w <= position){
                position = stations[si] + w +1;
                si += 1;
            }else{
                answer += 1;
                position += w*2 +1;
            }
        }
        return answer;
    }
    public static void main(String[] args){

    }
}
