import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] answerArray = new String[a.length()];
        
        for (int i=0; i<a.length(); i++) {
            char letter = a.charAt(i);
            
            if (Character.isUpperCase(letter)) {
                letter = Character.toLowerCase(letter);
            } else {
                letter = Character.toUpperCase(letter);
            }
            
            answerArray[i] = Character.toString(letter);
        }
        
        String answer = String.join("", answerArray);
        System.out.println(answer);
    }
}