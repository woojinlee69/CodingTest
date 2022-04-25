package programmersLv2;

import java.util.Arrays;
//score : 75 / effi. Test : 0
// i와k 가 다르고 String startsWith 가 True 인것

public class programmersPhoneNumList {
    public static boolean solution(String[] phone_book){
        boolean answer = true;

        for(int i = 0 ; i < phone_book.length ; i++) {
            for (int k = 0; k < phone_book.length; k++) {
                if (i!=k && phone_book[k].startsWith(phone_book[i]) == true) {
                    answer = false;
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        String[] tmp = {"119", "97674", "11955243"};
        solution(tmp);
    }
}
