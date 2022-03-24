package newID;

import java.util.Locale;
import java.util.Scanner;

class NewId {
    public static String solution(String new_id){
        String answer = "";
        answer = new_id.toLowerCase(); //step1
        answer = answer.replaceAll("[^-_.a-z0-9]",""); //step2
        answer = answer.replaceAll("[.]{2,}","."); //step3
        answer = answer.replaceAll("^[.]|[.]$",""); //step4

        if(answer.isEmpty() == true)
            answer = "a";

        if (answer.length() >= 16)
            answer = answer.substring(0, 15);
        answer = answer.replaceAll("^[.]|[.]$", ""); //step4
        if(answer.length() <=2 ){
            while(answer.length()<3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String test = sc.next();
        System.out.println(solution(test));
    }
}