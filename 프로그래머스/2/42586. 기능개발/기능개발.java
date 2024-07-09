import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 반복문 --> n번째 계산값(올림한)이 
        // - 그 전 스택(마지막)보다 작으면: 그 전 스택으로 add
        // - 그 전 스택(마지막)보다 크면: 지금 스택으로 add
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i=0; i<progresses.length; i++) {
            int daysLeft = (int)Math.ceil((double)(100-progresses[i]) / speeds[i]);
            
            if (stack.isEmpty()) { 
                stack.push(daysLeft);
            }
            
            else if (!stack.isEmpty() && daysLeft >= stack.peek()) {
                stack.push(daysLeft);
            } else if (!stack.isEmpty() && daysLeft < stack.peek()) {
                stack.push(stack.peek());
            }
        }
        System.out.println(stack);
        
        // Integer배열로 변환했다가 int배열로 변환 ! 
        
        // Integer[] answerInt = stack.toArray(new Integer[0]);
        // int[] answer = Arrays.stream(answerInt)
        //     .mapToInt(Integer::intValue)
        //     .toArray();
        // [9,7,7]
        
        // 스택을 돌면서 개수를 세주기 -> 해시맵..?
        Map<Integer, Integer> counter = new LinkedHashMap<>(); //숫자: 개수
        List<Integer> answerList = new ArrayList<>();
        
        for (Integer element : stack) {
            counter.put(element, counter.getOrDefault(element, 0) + 1);
        }

        for (int value : counter.values()) {
            if (value != 0) {
                answerList.add(value);
            } 
        }
        
        Collections.reverse(answerList); // 리스트 뒤집기
        System.out.println(answerList);
        
        int[] answer = answerList.stream()
				.mapToInt(Integer::intValue)
				.toArray();
        return answer;
    }
}