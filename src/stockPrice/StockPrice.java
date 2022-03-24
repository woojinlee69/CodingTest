package stockPrice;

import java.util.ArrayList;

public class StockPrice {
    public static int[] solution(int[] price){
        ArrayList<Integer> list = new ArrayList<>();
        int now = price[0];
        int count = 1;
        for(int i = 1; i < price.length ; i++){
            if(now > price[i]){
                list.add(count);
                count =1;
                now = price[i];
            }else
                count++;
            continue;
        }
        list.add(count);
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++)
            answer[i] = list.get(i);
        return answer;
    }
    public static void main(String[] args){
        int[] prices = {1,2,3,2,3};
        int[] answer = new int[5];
        answer = solution(prices);
        for(int i = 0 ; i < answer.length ; i++)
        System.out.println(answer[i]);
    }
}
