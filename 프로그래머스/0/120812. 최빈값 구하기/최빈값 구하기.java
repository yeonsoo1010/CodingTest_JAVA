import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        // 반복문으로 배열의 가장 큰 숫자 찾기
        int max = 0;
        
        for (int i=0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } 
        }
        // System.out.println(max);
        
        // count 배열 만들기
        int[] count = new int[max+1];
        
        for (int i=0; i<array.length; i++) {
            int element = array[i]; // element: i번째 요소
            count[element] ++;
        }
        
        System.out.println(Arrays.toString(count));
        
        // count 배열의 가장 큰 수의 인덱스 찾기
        // int countMax = Arrays.stream(count).max().getAsInt();
        // System.out.println(countMax);
        
        
        // 반복문: count 배열의 가장 큰 수의 인덱스 찾기
        int answer = 0; // answer: maxIndex
        int countMax = 0;
        
        for (int i=0; i<count.length; i++) {
            if (count[i] > countMax) {
                countMax = count[i];
                answer = i;
            } else if (count[i] == countMax) { // 여러 개
                answer = -1;
            } 
        }
        
        return answer;
    }
}