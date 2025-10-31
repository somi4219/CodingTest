import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPrime(int n){
        if(n<2) return false; // 0과 1은 소수가 아님
        if(n==2) return true; // 2는 소수임
        if(n%2==0) return false; // 2로 나누어지면 소수가 아님

        for(int i=3; i*i <=n; i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
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