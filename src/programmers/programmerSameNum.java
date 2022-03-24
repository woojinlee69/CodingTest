package programmers;

import java.util.ArrayList;

public class programmerSameNum {
    public static int[] solution(int[] arr){
        int[] answer = {};
        int tmp = 0;
        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            if(arr[i] == arr[i+1]){
//                continue;
//            }else{
//                if(arr[i] == tmp) {
//                    list.add(arr[i + 1]);
//                    tmp = arr[i + 1];
//                }else{
//                    list.add(arr[i]);
//                    list.add(arr[i+1]);
//                    tmp = arr[i+1];
//                }
//            }
//        }
//        answer = new int[list.size()];
//        for(int i = 0 ; i < list.size()-1 ; i++)
//            answer[i] = list.get(i);
//        System.out.println(list);
        int preNum = 0 ;
        for(int num : arr){
            if(preNum != num)
                list.add(num);
            preNum = num;
        }
        answer = new int[list.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(i).intValue();
            System.out.println(answer[i]);
        }
        return answer;
    }
    public static void main(String[] args){
        int arr[] = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }
}
