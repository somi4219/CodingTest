

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            deque.add(i+1);
        }

        for(int i=0; i<N-1; i++){
            deque.poll();
            deque.add(deque.poll());
        }
        System.out.println(deque.poll());
    }
}
