package programmers;

import java.util.stream.IntStream;

public class ProgrammersBudgets {
    public int solution(int[] budgets, int M) {
//        int min = 0 , max = 0 ;
//        for(int b : budgets){
//            if(b > max) max = b ;
//        }
//        int answer = 0 ;
//        while( min <= max){
//            int mid = (min + max)/2; // 중간값을 예산의 상한액으로 정하고
//            int sum = 0;
//            for( int b : budgets){
//                if( b > mid) sum += mid;
//                else sum += b ;
//            }
//            if(sum <= M){
//                min = mid + 1;
//                answer = mid;
//            } else {
//                max = mid - 1;
//            }
//        }
//        return answer;
//    }
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0); // optional(int)
        int answer = 0 ;
        while(min <= max){
            final int mid = (min+max)/2;
            int sum = IntStream.of(budgets)
                    .map( b -> Math.min(b, mid))
                    .sum();
            if(sum <= M){
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }

        return answer;
    }
}

