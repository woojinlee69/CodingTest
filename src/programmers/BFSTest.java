package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTest {
    class Position{
        int x, y;
        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
        boolean isValid(int width, int height){
            if( x < 0 || x >= width) return false;
            if(y < 0 || y >= height) return false;
            return true;
        }
    }

    public int Solution(int[][] maps){
        int answer = 0 ;
        Queue<Position> queue = new LinkedList<>();
        int mapsHeight = maps.length;
        int mapsWidth = maps[0].length;
        int[][] count = new int[mapsHeight][mapsWidth];
        boolean[][] visited = new boolean[mapsHeight][mapsWidth];

        queue.offer(new Position(0,0));
        count[0][0] = 1;
        visited[0][0] = true;

        while(!queue.isEmpty()){
            Position current = queue.poll();
            int currentCount = count[current.y][current.x];

            final int[][] moving = {{0, -1}, {0,1}, {1,0},{-1,0}};
            for(int i =0  ; i< moving.length ;i++){
                Position moved = new Position(current.x + moving[i][0], current.y + moving[0][i]);

                if(!moved.isValid(mapsWidth,mapsHeight)) continue;
                if(visited[moved.y][moved.x]) continue;
                if(maps[moved.y][moved.x] == 0) continue;

                count[moved.y][moved.x] = currentCount +1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);

            }
        }
        answer = count[mapsHeight-1][mapsWidth-1];
        if(answer == 0 ) return -1;

        return answer;
    }

}
