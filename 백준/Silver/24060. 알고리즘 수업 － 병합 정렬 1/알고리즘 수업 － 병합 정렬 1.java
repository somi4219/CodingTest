
import java.io.*;
import java.util.*;

public class Main {
    public static int[] A;
    public static int[] tmp;
    public static int result = -1;
    public static int cnt = 0; // 현재 저장 횟수
    public static int K; // 원하는 저장 횟수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken()); // 배열 A의 크기
        K = Integer.parseInt(st.nextToken()); // K번째 저장되는 수

        A = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(A,0,N-1);

        System.out.println(result);
    }

    // merge sort ( 병합 정렬 )

    // 오름차순 정렬
    public static void merge_sort(int[] A, int p, int r){
        if(cnt>K) return; // 현재 저장 횟수가 원하는 저장 횟수를 초과한 경우 불필요한 연산 진행X
        if(p<r){
            int q = (p+r)/2 ; // q는 p와 r의 중간지점 ( 반으로 나누기 )
            merge_sort(A, p, q); // 전반부 정렬
            merge_sort(A, q+1, r); // 후반부 정렬
            merge(A, p, q, r); // 병합
        }
    }

    // 병합하여 오름차순 정렬
    public static void merge(int[] A, int p, int q, int r){
        int i = p; // 전반부 시작
        int j = q+1; // 후반부 시작
        int t = 0;

        // 전반부 시작이 중간 지점보다 작고
        // 후반부 시작이 마지막보다 작을때 반복
        while(i<=q && j<=r){
            if(A[i]<=A[j]){ // 전반부의 값이 후반부의 값보다 작거나 같을때 전반부 넣어주기
                tmp[t++] = A[i++];
            }else{ // 전반부의 값이 후반부의 값보다 클때 작은 후반부 값 넣어주기
                tmp[t++] = A[j++];
            }
        }

        // 정렬이 끝나고도 남은 경우
        while(i<=q){ // 전반부 아직 중간지점 다다르지 않았을때 반복 ( 전반부 남음 )
            tmp[t++] = A[i++];
        }

        while(j<=r){ // 후반부 아직 끝지점 다다르지 않았을때 반복 ( 후반부 남음 )
            tmp[t++] = A[j++];
        }

        i=p; // 시작지점으로 다시 초기화
        t=0;
        while(i<=r){ // 처음부터 끝까지 결과 저장
            cnt ++; // 현재 저장 횟수 누적

            if(cnt == K){ // 원하는 저장 횟수까지 도달했다면
                result = tmp[t]; // 당시 저장되는 수를 result에 저장
                break;
            }
            A[i++] = tmp[t++];
        }
    }


}
