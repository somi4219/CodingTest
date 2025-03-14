import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String command = st.nextToken();

            switch(command){
                case "pop" :
                    System.out.println(queue.isEmpty()?-1:queue.poll());
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    System.out.println(queue.isEmpty()?1:0);
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        System.out.println("-1");
                    }else{
                        int result = queue.poll();
                        System.out.println(result);
                        queue.add(result);
                        for(int j=0; j<queue.size()-1; j++){
                            queue.add(queue.poll());
                        }
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()){
                        System.out.println("-1");
                    }else{
                        for(int j=0; j<queue.size()-1; j++){
                            queue.add(queue.poll());
                        }
                        int result = queue.poll();
                        System.out.println(result);
                        queue.add(result);
                    }
                    break;
                case "push" :
                    int X = Integer.parseInt(st.nextToken());
                    queue.add(X);
                    break;
            }
        }

    }
}
