import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stackInt = new Stack<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            switch(command){
                case "push" :
                    int X = Integer.parseInt(st.nextToken());
                    stackInt.push(X);
                    break;
                case "pop" :
                    System.out.println(stackInt.isEmpty()?-1:stackInt.pop());
                    break;
                case "size" :
                    System.out.println(stackInt.size());
                    break;
                case "empty" :
                    System.out.println(stackInt.isEmpty()?1:0);
                    break;
                case "top" :
                    System.out.println(stackInt.isEmpty()?-1:stackInt.peek());
                    break;
            }
        }
    }
}
