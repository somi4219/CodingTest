import java.util.*;
import java.io.*;

public class Main {
    static int K; // 이동 횟수
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        K = 0;

        sb = new StringBuilder();
        hanoi(N,1,2,3);

        System.out.println(K);
        System.out.println(sb);
    }

    /*
		N : 원판의 개수
		start : 출발지
		mid : 옮기기 위해 이동해야 장소
		to : 목적지
	 */
    public static void hanoi(int n, int start, int mid, int to) {
        // 이동할 원판의 수가 1개일 때(탈출 조건)
        if (n == 1) {
            K++;
            sb.append(start + " " + to + "\n");
            return;
        }

        // 1 -> 2로 n-1개를 옮김.
        hanoi(n - 1, start, to, mid);

        // 가장 큰 원판을 목적 지점으로 옮김
        sb.append(start + " " + to + "\n");
        K++;
        // 2 -> 3으로 n-1개를 옮김.
        hanoi(n - 1, mid, start, to);
    }
}
