//18870
package Silver.좌표압축;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            sorted[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;
        for(int i : sorted){
            if(!map.containsKey(i)){
                map.put(i,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int j : arr){
            int ranking = map.get(j);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(sc.next());
//        }
//
//        //순서정렬
//        int[] arr_align = arr.clone();
//        int j=0;
//        while (j < N - 1) {
//            for(int i=0; i<N-1; i++){
//                int change = 0;
//                if(arr_align[i] > arr_align[i+1]){
//                    change = arr_align[i];
//                    arr_align[i] = arr_align[i+1];
//                    arr_align[i+1] = change;
//                }
//            }
//            j++;
//        }
////        System.out.println(Arrays.toString(arr_align));
//
//        //중복제거
//        int[] arr_edit = new int[N];
//        int k=0;
//        for(int i=0; i<N-1; i+=2){
//            if(arr_align[i] != arr_align[i+1]){
//                if (k < N - 2) {
//                    arr_edit[k] = arr_align[i];
//                    arr_edit[k+1] = arr_align[i+1];
//                    k+=2;
//                }
//            }
//        }
////        System.out.println(Arrays.toString(arr_edit));
//
//        // 재계산한 좌표를 매칭시켜서 결과 프린트
//        for(int i=0; i<N; i++){
//            for(int t=0; t<N; t++){
//                if(arr[i] == arr_edit[t]){
//                    System.out.print(t+" ");
//                    break;
//                }
//            }
//        }
//    }
}
