//2525
package Bronze.오븐시계;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clock = sc.nextInt();
        int min = sc.nextInt();
        int hour = sc.nextInt();

        min += hour;

        if(min >=60){
            clock += min / 60;
            min = min % 60;
        }
        if(clock>=24){
            clock = clock % 24;
        }

        System.out.println(clock + " " + min);
    }
}
