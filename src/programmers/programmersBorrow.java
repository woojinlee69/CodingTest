package programmers;

public class programmersBorrow {
    public static int solution(int n, int[] lost, int[] reserve){
        int answer = 0 ;
        int lostNum = lost.length;
        int reserveNum = reserve.length;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = 1;
        for(int j = 0 ; j < lostNum ; j++)
            arr[lost[j]-1] = 0;
        for(int k = 0 ; k < reserveNum ; k++)
            arr[reserve[k]-1] += 1;
        if(arr[0] == 0 && arr[1] ==2 ){
            arr[0] = 1; arr[1] =1;
        }
        if (arr[arr.length - 1] == 0 && arr[arr.length-2] == 2) {
            arr[arr.length -1 ] = 1;
            arr[arr.length -2 ] = 1;
        }
        for(int i =  1 ; i < n-1 ;i++){
            if(arr[i]==0 && arr[i-1] ==2){
                arr[i] = 1;
                arr[i-1] = 1;
            }else if(arr[i] == 0 && arr[i+1] == 2){
                arr[i] = 1;
                arr[i+1] = 1;
            }
        }
        for(int k = 0 ; k < n ; k++){
            if(arr[k] == 1 || arr[k] == 2) answer += 1;
        }
        return answer;
    }
    public static void main(String[] args){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n, lost, reserve));

    }
}
