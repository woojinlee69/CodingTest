package lottos;

import java.util.Scanner;

public class lottos {
    public int[] solution(int[] lottos, int[] win_nums){
        int[] answer = {};
        return answer;
    }
    public static void main(String[] args){
        int[] lottos ={};
        int[] win_nums = {};

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 6 ; i ++){
            lottos[i] = sc.nextInt();
            System.out.println(lottos[i]);
        }
        for(int i = 0 ; i < 6 ; i++){
            win_nums[i] = sc.nextInt();
            System.out.println(win_nums[i]);
        }

    }
}
