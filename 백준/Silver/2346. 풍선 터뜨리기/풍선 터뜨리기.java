
import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] inBalloon = new int[N];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            inBalloon[i] = Integer.parseInt(st.nextToken());
            deque.add(i+1); // 풍선 번호
        }

        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        deque.poll();
        bw.write("1 ");

        int content = inBalloon[0];
        for(int i=1; i<N; i++){
            if(content>0){
                for(int j=1; j<content; j++){
                    deque.add(deque.poll());
                }
                int next = deque.poll();
                content = inBalloon[next-1];
                bw.write(next +" ");
            }else{
                for(int j=1; j<-content; j++){
                    deque.addFirst(deque.pollLast());
                }
                int next = deque.pollLast();
                content = inBalloon[next-1];
                bw.write(next +" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
