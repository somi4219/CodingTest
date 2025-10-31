import java.io.*;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int allChangeTo0 = 0;
        int allChangeTo1 = 0;

        if(S.charAt(0)=='0'){
            allChangeTo1 ++;
        }else{
            allChangeTo0 ++;
        }

        for(int i=0; i<S.length()-1; i++){
            if(S.charAt(i) != S.charAt(i+1)){
                if(S.charAt(i+1)=='0'){
                    allChangeTo1 ++;
                }else{
                    allChangeTo0 ++;
                }
            }
        }

        System.out.println(min(allChangeTo0,allChangeTo1));
    }
}