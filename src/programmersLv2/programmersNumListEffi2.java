package programmersLv2;

import java.util.HashMap;

public class programmersNumListEffi2 {
    public static boolean solution(String[] phone_book){
        boolean answer = true;
        HashMap<String, String> hashMap = new HashMap<>();

        for(String input : phone_book){
            hashMap.put(input, input);
        }
        for(String target : phone_book){
            for(int i = 0 ; i < target.length() ; i ++){
                if(hashMap.containsKey(target.substring(0,i))){
                    return false;

                }else if (hashMap.get(target.substring(0,i)) != null)
                    return false;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        String[] tmp = {"119", "2231", "11912317"};
        solution(tmp);
    }
}
