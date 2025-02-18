//1427
package Silver.소트인사이드;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] digits = N.toCharArray();

        int j =0;
        while(j<N.length()-1){
            for(int i=0; i<N.length()-1; i++){
                char change;
                int check = Integer.parseInt(String.valueOf(digits[i]));
                int check_next = Integer.parseInt(String.valueOf(digits[i+1]));
                if(check<check_next){
                    change = digits[i];
                    digits[i] = digits[i+1];
                    digits[i+1] = change;
                }
            }
            j++;
        }
        System.out.println(digits);
    }
}
