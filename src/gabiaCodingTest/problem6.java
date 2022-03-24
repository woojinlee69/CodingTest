package gabiaCodingTest;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;

public class problem6 {
    public static int solution(int[][] grid, int K){
        int answer = 0 ;
        int sum = 0;
        ArrayList<Integer> customerSum ;
        for(int i = 0; i+2*K <= grid.length; i++){
            for(int j = 0 ; j <= K; j ++){
                sum += grid[i][j];
            }
            System.out.println(sum);
        }
        return answer ;
    }

    public static void main(String[] args){
        int[][] grid = {{3,4,5},{2,3,4},{1,2,3}};
        int K = 1;
        solution(grid, K);
    }
}
