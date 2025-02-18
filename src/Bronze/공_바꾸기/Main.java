//10813
package Bronze.공_바꾸기;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for(int t=0; t<N; t++){
            arr[t] = t+1;
        }
        for(int k=0; k<M; k++){
            int change;
            int i = sc.nextInt();
            int j = sc.nextInt();
            change = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = change;
        }
        for(int t=0; t<N; t++){
            System.out.print(arr[t]+" ");
        }
    }
}