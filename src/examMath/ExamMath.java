package examMath;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamMath {
    public static int[] solution(int[] answers){
        int[] answer = {};
        int[] studentA = {1,2,3,4,5};
        int[] studentB = {2,1,2,3,2,4,2,5};
        int[] studentC = {3,3,1,1,2,2,4,4,5,5};
        int answerA = 0, answerB = 0, answerC = 0;
        for(int i = 0 ; i < answers.length ; i++){
            if(studentA[i%studentA.length] == answers[i]) answerA++;
            if(studentB[i%studentB.length] == answers[i]) answerB++;
            if(studentC[i%studentC.length] == answers[i]) answerC++;
        }
        int max = Math.max(answerA, Math.max(answerB,answerC));
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==answerA) list.add(1);
        if(max==answerB) list.add(2);
        if(max==answerC) list.add(3);

        answer = new int[list.size()];
        for(int i =0 ; i<answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] answers = {};
        for(int i = 0 ; i < answers.length ; i++){
            answers[i] = sc.nextInt();
        }
        System.out.println(solution(answers));
    }
}
