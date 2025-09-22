import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int max_index = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                max_index = i+1;
            }
        }

        System.out.println(max);
        System.out.println(max_index);
    }
}