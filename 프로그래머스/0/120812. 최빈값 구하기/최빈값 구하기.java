class Solution {
    public int solution(int[] array) {
        int[] arr_count = new int[1000];
        
        for(int i=0; i<array.length; i++){
            int value = array[i];
            arr_count[value] += 1;
        }
        
        int max = 0;
        int answer = 0;
        boolean isDuplicate = false;
        for(int i=0; i<arr_count.length; i++){
            if(arr_count[i]>max){
                max = arr_count[i];
                answer = i;
                isDuplicate = false; // 새로운 최빈값 발견
            }else if(arr_count[i]==max){
                isDuplicate = true; // 중복된 최빈값 발견
            }
        }
        
        return isDuplicate ? -1 : answer;
    }
}