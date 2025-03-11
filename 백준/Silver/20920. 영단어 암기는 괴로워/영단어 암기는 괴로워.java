
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); // 개수
        int M = Integer.parseInt(st.nextToken()); // 길이의 기준

        HashMap<String, Integer> vocaList = new HashMap<>(N); // voca, 빈도
        for(int i=0; i<N; i++){
            String s = br.readLine();
            if(s.length()>=M){
                vocaList.put(s, vocaList.getOrDefault(s, 1) + 1);
            }
        }

        // vocaList의 단어(key)들을 가져와 저장
        List<String> keySet = new ArrayList<>(vocaList.keySet());

        // comparator, 람다 표현식 사용하여 정렬
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 1. 빈도(value) 내림차순으로 나열
                int frequency = vocaList.get(o2).compareTo(vocaList.get(o1));
                if(frequency != 0) return frequency; //내림차순 정렬

                // 2. 빈도(value)가 같다면 단어(key) 길이 내림차순으로 나열
                int length = Integer.compare(o2.length(),o1.length());
                if(length != 0) return length;

                // 3. 빈도(value)와 단어(key) 길이 둘다 같으면 사전순으로 나열
                return o1.compareTo(o2);
            }
        });

        for(String result : keySet){
            bw.write(result +"\n");
        }

        bw.flush();
        bw.close();
    }
}
