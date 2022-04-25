package programmersLv2;

//score : 83.0 / effi. Test : 0
//효율성 Test를 위해 단일 for로 수정 예정? 해시?

import java.util.HashSet;

public class programmersPhoneNumListEffi {
    public static boolean solution(String[] phone_book){
        boolean answer = true;
//
//        for(int i = 0 ; i < phone_book.length ; i++) {
//            for (int k = 0; k < phone_book.length; k++) {
//                if (i!=k && phone_book[k].startsWith(phone_book[i]) == true) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
        HashSet hashSet = new HashSet<>();
        for(int i = 0 ; i < phone_book.length ; i++){
            hashSet.add(phone_book[i]);
        }
        for(int k = 0 ; k < phone_book.length ; k++){
            if(!hashSet.equals(phone_book[k]) && hashSet.contains(phone_book[k]) == true ){
                answer = false;
                break;
            }
        }
        System.out.println(hashSet);
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        String[] tmp = {"123", "456", "789"};
        solution(tmp);
    }
}
