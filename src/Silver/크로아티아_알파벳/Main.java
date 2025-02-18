//2941
package Silver.크로아티아_알파벳;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int count =0;
        String list = "czds";
        for(int i=0; i<word.length(); i++){
            count ++;
            if(i>0){
                if(word.charAt(i)=='=' || word.charAt(i)=='-'){
                    for(int j=0; j<list.length(); j++){
                        if(word.charAt(i-1)==list.charAt(j)){
                            count --;
                        }
                    }
                }else if(word.charAt(i)=='j'){
                    if(word.charAt(i-1)=='l'||word.charAt(i-1)=='n'){
                        count --;
                    }
                }else if(word.charAt(i)=='z'){
                    if(i+1 < word.length() && word.charAt(i-1)=='d' && word.charAt(i+1)=='='){
                        count --;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
