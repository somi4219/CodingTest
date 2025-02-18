//5622
package Bronze.다이얼;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int count = 0;
        for(int i=0; i< word.length(); i++){
            int num = (int)(word.charAt(i));
            if(num<68){
                count += 3;
            }//2
            if(num>67 && num<71){
                count += 4;
            }//3
            if(num>70 && num<74){
                count += 5;
            }//4
            if(num>73 && num<77){
                count += 6;
            }//5
            if(num>76 && num<80){
                count += 7;
            }//6
            if(num>79 && num<84){
                count += 8;
            }//7
            if(num>83 && num<87){
                count += 9;
            }//8
            if(num>86){
                count += 10;
            }//9
        }

        System.out.println(count);
    }
}
