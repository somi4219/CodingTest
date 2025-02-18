//1436
package Silver.영화감독_숌;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;

        int i=0; // 하나씩 셀 수
        while(N>0){
            String check = Integer.toString(i);

            int j =0;
            while(j<check.length()){ // 수에 666있는지 검사
                if(check.charAt(j)=='6' && j<check.length()-2){ //666이 연속된다면
                    if(check.charAt(j+1)=='6' && check.charAt(j+2)=='6'){
                        N--; // 사용자가 원하는 수 감소
                        result = i; // 666 있으니 result에 저장
                        break; // 666 있는 거 확인하면 반복문 종료
                    }
                }
                j++;// 6 발견 못하면 다음 문자로
            }
            i++;// 다음 수
        }
        System.out.println(result);
    }
}
