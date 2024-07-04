class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int id = 0;
        int pw = 0;
        int login = 0;
        
        // db의 모든 요소 반복문
        // 그 안의 첫번째 요소가 id_pw[0]랑 같으면 id 변수 +1, 두번째 요소가 id_pw[1]랑 같으면 pw 변수 +1, 모두다 같으면 login 변수 +1 (겹쳐도 ok)
        // login 변수가 0이 아니면 login, id/pw 마찬가지
        
        for (int i=0; i<db.length; i++) {
            if ( db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1]) ) {
                login ++;
            } else if (db[i][0].equals(id_pw[0])) {
                id ++;
            } else if (db[i][1].equals(id_pw[1])) {
                pw ++;
            }
        }
        
        if (login > 0) {
            answer = "login";
        } else if (id > 0) {
            answer = "wrong pw";
        } else if (pw > 0) {
            answer = "fail";
        }
        
        return answer;
    }
}