
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){
                case "1" : //정수 X를 스택에 넣는다.
                    stack.push(Integer.valueOf(st.nextToken()));
                    break;
                case "2" : //스택에 정수가 있다면 맨 위의 정수를 빼고 출력, 없다면 -1을 대신 출력
                    sb.append((stack.isEmpty() ? -1 : stack.pop())).append("\n");
                    break;
                case "3" : //스택에 들어있는 정수의 개수를 출력
                    sb.append(stack.size()).append("\n");
                    break;
                case "4" : //스택이 비어있으면 1, 아니면 0을 출력
                    sb.append((stack.isEmpty() ? 1 : 0)).append("\n");
                    break;
                case "5" : //스택에 정수가 있다면 맨 위의 정수를 출력, 없다면 -1을 대신 출력
                    sb.append((stack.isEmpty() ? -1 : stack.peek())).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
