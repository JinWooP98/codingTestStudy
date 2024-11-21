import java.util.*;

public class Quiz5 {

        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];

            // 매핑으로 사람이름과 점수를 매치시키기
            Map<String, Integer> namePoint = new HashMap<>();

            for(int i = 0; i < name.length; i++) {
                namePoint.put(name[i], yearning[i]);
            }

            // 사진은 배열안의 배열이므로
            // 배열 하나씩 꺼내서 위에 설정한 mapping에 key를 가지고 있다면 점수를 point에 더하면서 저장

            for(int i = 0; i < photo.length; i++) {

                int point = 0;

                for(String person : photo[i]) {

                    if(namePoint.containsKey(person)) {
                        point += namePoint.get(person);
                    } else {
                        point += 0;
                    }
                }

                // 최종 포인트를 answer에 저장
                answer[i] = point;
            }
            return answer;
        }
    }

