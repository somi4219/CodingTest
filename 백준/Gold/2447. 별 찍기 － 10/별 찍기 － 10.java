import java.util.*;
import java.io.*;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        drawStar(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    static void drawStar(int x, int y, int N, boolean blank){

        // 공백일 경우 ( 사각형의 가운데 지점 )
        if(blank){
            for(int i=x; i<x+N; i++){
                for(int j=y; j<y+N; j++){
                    arr[i][j]=' ';
                }
            }
            return;
        }

        // 더이상 쪼갤 수 없는 블록일 때
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = N/3; // N=27일 경우 ( 27x27 ) 한 블록의 사이즈는 9 ( 9x9 )
        int count = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) { // 공백 칸일 경우
                    drawStar(i, j, size, true);
                } else {
                    drawStar(i, j, size, false);
                }
            }
        }
    }
}