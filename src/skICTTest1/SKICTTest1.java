package skICTTest1;

public class SKICTTest1 {
    public int solution(int money, int[] costs){
        int answer = 0 ;
        int[] coinPrice = {1, 5, 10, 50, 100, 500};
        int[] makePrice = {};
        makePrice = new int[6];

        for(int i=0; coinPrice[5]<=money/500;i++){
            for(int j=0; coinPrice[4] <= money/100; j++){
                for(int k=0; coinPrice[3] <= money/50; k++){
                    for(int l=0; coinPrice[2] <= money/10; l++){
                        for (int a=0; coinPrice[1]<=money/5;a++){
                            for (int b = 0; coinPrice[0]<=money/1;b++){

                            }
                        }
                    }
                }
            }
        }






        return answer;
    }
    public static void main(String[] args){

    }
}
