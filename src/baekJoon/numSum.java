package beakJoon;

import java.util.Scanner;

public class numSum {
    public static int solution(int numEA, String num){
        int sum = 0 ;
        for(int i = 0 ; i < numEA ; i++){
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args){
        int numEA = 0;
        String num;
        Scanner sc  = new Scanner(System.in);
        numEA = sc.nextInt();
        num = sc.next();
        solution(numEA, num);
    }
}
