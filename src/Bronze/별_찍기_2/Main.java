//2439
package Bronze.별_찍기_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int k=N-i; k<N; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
