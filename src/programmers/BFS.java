package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    class Position{ //x y 를 같이쓰기위해 메소드
        int x, y;

        Position(int x, int y){
            this.x = x;
            this.y = y;
        }

        boolean isValid(int width, int height){
            if( x < 0 || x >= width) return false;
            if( y < 0 || y >= height) return false;
            return true;
        }

    }

    public int solution(int[][] maps){
        //BFS : Queue
        Queue<Position> queue = new LinkedList<>();
        int mapsHeight = maps.length;
        int mapsWeight = maps[0].length;
        int[][] count = new int[mapsHeight][mapsWeight];
        boolean[][] visited = new boolean[mapsHeight][mapsWeight];


        queue.offer(new Position(0,0));
        count[0][0] = 1;
        visited[0][0] = true;

        while(!queue.isEmpty()) { //큐가 빌때까지 loop
            Position current = queue.poll();  //현재 위치 꺼내기

            int currentCount = count[current.y][current.x];


            //4ㄱㅏ지경우
            final int[][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            for (int i = 0; i < moving.length; i++) { //이동가능한 모든 경우의 수를 계산에서 queue에 다시 넣기
                Position moved = new Position(current.x + moving[i][0], current.y + moving[i][1]);
                if (!moved.isValid(mapsWeight, mapsHeight)) continue;
                if (visited[moved.y][moved.x]) continue;
                if (maps[moved.y][moved.x] == 0) continue; // 0:벽 1: 길

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
                //모든 루프를 돌고 나면 탐색 끝
            }
        }
        int answer = count[mapsHeight -1][mapsWeight-1];
        if(answer == 0) return -1;
        return answer;
    }
}
