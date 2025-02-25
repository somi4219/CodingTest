

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 동쪽의 M개 중 서쪽과 연결될 N개를 뽑는다
        // 조합은 순서 X , 교차 없이 다리를 놓을 수 있음
        // 조합 공식 + DP를 적용하여 풀이
        int[][] dp = new int[30][30];
        for(int t=0; t<T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for(int i=0;i<30;i++) {
                dp[i][i] = 1;
                dp[i][0] = 1;
            }

            // 반복문 사용
            // 반복문을 사용하는 초기 작업은 2C1이어야 함
            // 2C1 = 1C1 + 1C0
            for(int i=2;i<30;i++) {
                for(int j=1;j<30;j++) {
                    dp[i][j] =dp[i-1][j]+dp[i-1][j-1];

                }
            }

            //com(M,N);
            // M-N+1 번
            System.out.println(dp[M][N]);
        }
    }


//    팩토리얼을 연산하면 스택 오버플로우 발생 , 재귀보다는 반복문 이용
//    public static int calculate(int N, int M){
//        return factorial(M) / ( factorial(M-N) * factorial(N) );
//    }
//    public static int factorial(int num){
//        if(num == 1) return 1;
//        else return num * factorial(num-1);
//    }


}
