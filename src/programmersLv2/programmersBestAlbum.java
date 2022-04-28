package programmersLv2;

import java.util.HashMap;
import java.util.HashSet;

//장르별 소팅 후 재생 많이된 장르에서 2개 뽑고
//다음 장르에서 2개 뽑고
// 장르의 개수를 먼저 뽑아야
public class programmersBestAlbum {
    public static int[] solution(String[] genre, int[] plays){
        int[] answer = {};
        HashSet hashSet = new HashSet<>();
        for(int i = 0 ; i < genre.length ; i++){
            hashSet.add(genre[i]);
        }
        int genreNum = hashSet.size();
        answer = new int[genreNum*2];

        HashMap hashMap = new HashMap<>();
        for(String input : genre){
            hashMap.put(input, plays);
        }
        for( Object key : hashMap.keySet() ){
            String value = hashMap.get(key);
            System.out.println( String.format("키 : "+key+", 값 : "+value);
        }
        System.out.println(genreNum);
        return answer;
    }

    public static void main(String[] args){
        String[] genre = {"classic", "pop", "classic", "classic","pop"};
        int[] palys = {500, 600, 150, 800, 2500};
        solution(genre,palys);
    }
}
