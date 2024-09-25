import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, List<String>> complain = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();
        int[] answer = new int[id_list.length];
        
        
        // complain 해쉬맵 틀 만들어놓기
        for (String id : id_list) {
            complain.put(id, new ArrayList());
        }
        
        // cnt 해쉬맵 틀 만들어놓기 - 우선 다 0번으로 채워넣기
        for (String id : id_list) {
            cnt.put(id, 0);
        }
        
        // complain 채워넣기 -> 중복 제거 필요 !!! 
        for (String oneReport : report) {
            String[] splitReport = oneReport.split(" ");
            String whoReports = splitReport[0];
            String whoisReported = splitReport[1];
            
            if (!complain.get(whoisReported).contains(whoReports)) { //이미 들어가있으면 안넣기
                complain.get(whoisReported).add(whoReports);
            }
            
        }
        // System.out.println(complain); 
        // 신고당한 id, 신고한 id -> 해쉬맵, 리스트 중복없이
        
//         if 밸류 리스트의 size 가 k 이상이면
//         그 밸류 안의 리스트 돌면서
//         cnt 해쉬맵에서
//         무지에 +1, 어피치에 +1

//         네오의 경우 무지에 +1, 프로도에 +1
//         최종 무지 +2, 프로도 +1, 어피치 +1, 네오 0
        
        for (Map.Entry<String, List<String>> entry : complain.entrySet()) {
            List<String> tmp = entry.getValue();
            
            if (tmp.size() >= k) {
                for (String one : tmp) {
                    cnt.put(one, cnt.get(one) + 1);
                }
            }
        }
        // System.out.println(cnt);
        
        // id_list 순서대로 배열에 넣기 
        for (int i=0; i<id_list.length; i++) {
            answer[i] = cnt.get(id_list[i]);
        }
        
        return answer;
    }
}