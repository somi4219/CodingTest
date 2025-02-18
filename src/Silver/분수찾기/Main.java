//1193
package Silver.분수찾기;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//
//        int turn = 0; // 0이면 x+1, 1이면 y+1
//        int x = 1;
//        int y = 1;
//        if(count==1){
//            System.out.println(y+"/"+x);
//        }else{
//            while(count-1>0){
//                if(y==1 && x==2){
//                    y++;
//                    x--;
//                    turn = 3;
//                }else if(y==2 && x==1){
//                    turn = 1;
//                }
//
//                if(turn ==0){
//                    x++;
//                    turn = 1;
//                    if(x!=1 && y!=1){
//                        y--;
//                        turn = 0;
//                    }
//                }else if(turn == 1){
//                    y++;
//                    turn = 0;
//                    if(x!=1 && y!=1){
//                        x--;
//                        turn = 1;
//                    }
//                }
//                count--;
//            }
//            System.out.println(y+"/"+x);
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // 대각선 번호 (n번째 대각선이 나타내는 분수들)
        int diagonal = 1;

        // 대각선 찾기
        while (count > diagonal) {
            count -= diagonal;
            diagonal++;
        }

        // 분수의 값 계산하기
        // y/x
        if (diagonal % 2 == 1) {
            // 대각선이 홀수면 2/1 -> 3/1 y 증가
            System.out.println((diagonal - count + 1) + "/" + count);
        } else {
            // 대각선이 짝수면 1/1 -> 1/2 x 증가
            System.out.println(count + "/" + (diagonal - count + 1));
        }
    }
}
