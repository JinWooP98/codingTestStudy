import java.util.*;

public class Quiz5 {

        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];

            Map<String, Integer> namePoint = new HashMap<>();

            for(int i = 0; i < name.length; i++) {
                namePoint.put(name[i], yearning[i]);
            }

            for(int i = 0; i < photo.length; i++) {

                int point = 0;

                for(String person : photo[i]) {

                    if(namePoint.containsKey(person)) {
                        point += namePoint.get(person);
                    } else {
                        point += 0;
                    }
                }

                answer[i] = point;
            }
            return answer;
        }
    }

