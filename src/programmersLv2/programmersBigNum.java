package programmersLv2;

public class programmersBigNum {
    public static String solution(String number, int k){
//        String answer = "";
//        int[] tmp = new int[number.length()];
//        ArrayList<Integer> list = new ArrayList();
//        for(int i = 0 ; i < number.length() ; i++) {
//            tmp[i] = number.charAt(i)-'0';
//            System.out.println(tmp[i]);
//        }
//        Arrays.sort(tmp);
//        for(int t = 0 ; t< tmp.length ;t++)
//        System.out.print(tmp[t]);
//        for(int j = tmp.length-1; j>=(tmp.length-k-1) ; j--){
//            list.add(tmp[j]);
//        }
//        answer = list.toString().replace(",","");
//        System.out.println(answer);
//        return answer;
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int max = 0;
        for(int i = 0 ; i < number.length() - k ; i++){
            max = 0 ;
            for(int j = idx ; j <= k+i ; j++){
                if(max < number.charAt(j) - '0'){
                    max = number.charAt(j) - '0';
                    idx = j + 1 ;
                }
            }sb.append(max);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String test = "1231234";
        int k = 3;
        System.out.println(solution(test, k));
    }
}
