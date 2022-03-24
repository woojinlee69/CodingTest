package programmers;

public class programmersMidString {
    public static String solutiuon(String s){
        String answer = "";
        int position = 0 ;
        if(s.length() % 2 ==0){
            position = s.length()/2 -1;
            answer = s.charAt(position) + String.valueOf(s.charAt(position+1));
            return answer;
        }else
        {
            position = s.length()/2;
            answer = String.valueOf(s.charAt(position));
            return answer;
        }
    }
    public static void main(String[] args){
        String s = "abcde";
        System.out.println(solutiuon(s));
    }
}
