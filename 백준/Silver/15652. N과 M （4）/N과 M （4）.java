import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] num;
    static int[] result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        num = new int[N];
        result = new int[M];

        for(int i=0; i<N; i++){
            num[i] = i+1;
        }

        backTracking(0,0);
    }

    static void backTracking(int start, int depth) {
        // M개 숫자를 다 고른 경우, 결과를 출력
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();  // 한 조합을 출력한 후 줄 바꿈
            return;
        }

        // 가능한 숫자를 하나씩 시도
        for (int i = start; i < N; i++) {  // start를 i로 두어 중복을 허용
            result[depth] = num[i];         // 현재 위치에 숫자 할당
            backTracking(i, depth + 1);     // i부터 시작하여 재귀 호출
        }
    }
}
