class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int max_index = 0;
        
        // a:array로 for문 짜면 index가 바로 안나와서 불편
        // int i=0으로 for문 짜야 인덱스와 값이 둘다 나올 수 있을 것
        for (int i=0; i<array.length; i++) {
            if (array[i] > max) {
                max_index = i;
                max = array[i];
                
            } else {
                max = max;
            }
        }
        
        int[] answer = {max, max_index};
        return answer;
    }
}