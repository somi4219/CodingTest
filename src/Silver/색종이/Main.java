//2563
package Silver.색종이;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [][] arr = new int[100][100];

        int over =0;
        for(int i=0;i<count; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            for(int j=y; j<y+10; j++){
                for(int k=x; k<x+10; k++){
                    if(arr[j][k]==1){
                        over ++;
                    }else{
                        arr[j][k] = 1;
                    }
                }
            }
        }
        int result = 100 * count - over;
        System.out.println(result);

    }
}
