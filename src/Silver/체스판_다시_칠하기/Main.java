//1018
package Silver.체스판_다시_칠하기;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static int[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[N][M];
        for(int i=0;i<N;i++){
            String str = sc.next();
            for(int j=0;j<M;j++){
                if(str.charAt(j)=='B'){
                    arr[i][j] = 0; // B일 때는 0
                }else{
                    arr[i][j] = 1; // W일 때는 1
                }
            }
        }

        for(int i=0;i<N-8+1;i++){
            for(int j=0;j<M-8+1; j++){
                find(i,j);
            }
        }

        System.out.println(min);

    }

    public static void find(int y, int x){
        int color = arr[y][x];
        int count = 0;

        for(int i=y;i<y+8;i++){
            for(int j=x;j<x+8;j++){
                if(arr[i][j]!=color){
                    count++;
                }
                if(color==0){
                    color=1;
                }else{
                    color=0;
                }
            }
            if(color==0){
                color=1;
            }else{
                color=0;
            }
        }

        count = Math.min(count, 64-count);
        min = Math.min(min,count);
    }
}
