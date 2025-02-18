//2485
package Silver.가로수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 가로수 간격 계산
//        Set<Integer> space = new HashSet<>();
        int max_divisor = 0;
        for (int i = 0; i < N-1; i++) {
//            space.add(arr[i + 1] - arr[i]);
            int space = arr[i+1] - arr[i];
            max_divisor = gcd(space,max_divisor);
        }

//        //간격들의 공통 약수 구하기
//        int j = 1;
//        int check = 0;
//        int max = Collections.max(space); // 제일 큰 간격
//        Set<Integer> divisor = new HashSet<>();
//        while (j < max) {
//            for (int i : space) {
//                if (i % j == 0) {
//                    check++;
//                }
//                if (check == space.size()) {
//                    divisor.add(j);
//                    check = 0;
//                }
//            }
//            check = 0;
//            j++;
//        }
//
//        int result = 0;
//        int k = 0;
//        //제일 큰 약수에 맞게 가로수 사이에 배치 해야 하는 수 찾기
//        int max_divisor = Collections.max(divisor);
//        for (int i = arr[0]; i < arr[N - 1]; i += max_divisor) {
//            while (k < N && arr[k]<=i) {
//                if (i != arr[k]) {
//                    result++;
//                    break;
//                }
//                k++;
//            }
//        }



        // 전체 가로수 = ( 최대위치 - 최소위치 ) / 최대공약수 + 1
        // - 심어져 있는 가로수
        int result = ((arr[N-1]-arr[0]) / max_divisor + 1)-arr.length;
        //프린트
        System.out.println(result);
    }

    static int gcd(int space, int max_divisor){
        if(max_divisor==0)return space;
        else return gcd(max_divisor,space%max_divisor);
    }


//    // 유클리드 호제법 -> 최대 공약수 구하는 방법임
//    static int gcd(int a, int b){
//        if(b==0)return a;
//        else return(gcd(b,a%b));
//    }
}
