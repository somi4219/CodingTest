import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPrime(int n){
        if(n<2) return false; // 0과 1은 소수가 아님
        if(n==2) return true; // 2는 소수임
        if(n%2==0) return false; // 2로 나누어지면 소수가 아님
        
        // 2의 배수(짝수)로 나누어진다면 소수가 아님.
        // 짝수는 무조건 소수 x.
				// 따라서 +=2씩 증가하면 홀수로만 나눠볼 수 있음.
        for(int i=3; i*i <=n; i+=2){ // i*i<=n 까지만 비교
            if(n % i == 0){ // 그 중 나눴을때 0이면 소수가 아님
                return false;
            }
        }
        return true; // for문에서 걸러지지 않았다면 소수임
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for(int i = M; i <= N; i++){
            if(isPrime(i)){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}