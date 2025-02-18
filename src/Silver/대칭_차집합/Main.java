//1269
package Silver.대칭_차집합;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> A_arr = new HashSet<>();
        Set<Integer> B_arr = new HashSet<>();
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<A; i++){
            A_arr.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<B; i++){
            B_arr.add(Integer.parseInt(st.nextToken()));
        }

        //A-B
        int result = 0;
        for(int i: B_arr){
            if(!A_arr.contains(i)){
                result++;
            }
        }
        //B-A
        for(int i: A_arr){
            if(!B_arr.contains(i)){
                result++;
            }
        }

        System.out.println(result);

    }
}
