package beakJoon;

import java.util.Scanner;

public class wordNum {
    public static void main(String[] args){
        String tmp;
        Scanner sc = new Scanner(System.in);
        int count = 1 ;
        tmp = sc.nextLine();

        for(int i = 0 ; i < tmp.length() ; i++){
            if(tmp.charAt(i)== ' ')
                count++;
        }
        if( tmp.charAt(0) == ' ' && tmp.charAt(tmp.length()-1) == ' ')
            count -= 2;
        else if( tmp.charAt(0) == ' ' || tmp.charAt(tmp.length()-1) == ' ')
            count -= 1;
        System.out.println(tmp);
        System.out.println(count);

    }
}
