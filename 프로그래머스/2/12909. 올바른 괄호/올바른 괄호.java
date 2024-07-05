import java.util.ArrayDeque;
import java.util.Deque;
// stack !! 

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // for 반복문을 돌려서 문자 하나하나에 접근한다
        // 열린 괄호면
            // stack에 넣어준다
        // 닫힌 괄호면
            // stack pop()
        
        // s.isEmpty -> stack이 비어있으면 true, 비어있지 않으면 false
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char tmp : s.toCharArray()) {
            if (tmp == '(') {
                stack.add(tmp);
            } else if (tmp == ')') { 
                if (stack.isEmpty()) {
                    return false; // 스택이 비어있으면 올바른 괄호가 아님
                }
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) { 
            return true;
        } else {
            return false;
        }
    }
}