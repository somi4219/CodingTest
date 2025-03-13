import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> circle = new LinkedList<>();; // 원형 큐 이용
        for(int i=0; i<N; i++) {
            circle.add(i+1);
        }

        int[] result = new int[N]; // 삭제되는 숫자 저장
        int count = 0; // 삭제되는 숫자 저장을 위한 카운트
        while(!circle.isEmpty()){

            // K번째에 해당하는 수 앞에 있는 원소를 전부 뒤로 보낸다
            // Queue의 선입선출 방식을 이용함
            for(int i=0; i<K-1; i++){
                circle.add(circle.poll()); // 원소 삭제 -> 삭제한 원소 뒤에 저장
            }

            // 해당 원소 삭제하며 result에 저장
            result[count] = circle.poll();
            count++;
        }

        System.out.print("<");
        for(int i=0; i<N; i++){
            System.out.print(result[i]);
            if(i!=N-1){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
