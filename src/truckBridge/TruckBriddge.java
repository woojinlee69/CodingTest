package truckBridge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TruckBriddge {
    public int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        int tmep_weight = 0, idx = 0;
        Queue<Integer> queue = new LinkedList<>();

        while(true){
            if(idx == truck_weights.length)break;
            if(queue.size() == bridge_length){
                tmep_weight -= queue.poll();
            }
            else if(tmep_weight + truck_weights[idx] > weight){
                queue.offer(0);
                answer++;
            }
            else {
                queue.offer(truck_weights[idx]);
                tmep_weight += truck_weights[idx];
                answer++;
                idx++;
            }
        }
        return  answer + bridge_length;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bridge_length = sc.nextInt();
        int weight = sc.nextInt();
        int[] truck_weights = new int[weight];
        for(int i=0; i < truck_weights.length ; i++){
            truck_weights[i] = sc.nextInt();
        }
    }

}
