package skICTTest1;

public class test2 {
    public int[][] solutino(int n, boolean clockwise){
        int[][] answer = {};
        int[][] arr = new int[n][n];

        int firstNum = 1; // first
        int lastNum = 0 ; //end N
        if( clockwise == true){
            for(int j = 0 ; j < n-1 ; j ++){
                for(int i = 0 ; i < n-1 ; i++){
                    arr[j][i] = firstNum;
                    firstNum++;
                }
            }
        }else {

        }

        return answer;
    }
    public static void main(String[] args){

    }
}
