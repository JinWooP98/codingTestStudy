package Week2;

import java.util.*;

public class Quiz4 {

    public int[] solution(int N, int[] stages) {

        Map<Integer, Integer> failureCount = new HashMap<>();
        Map<Integer, Integer> totalCount = new HashMap<>();

        // 각 스테이지에 대한 초기 값 설정
        for (int i = 1; i <= N; i++) {
            failureCount.put(i, 0);  // 실패자 수 초기화
            totalCount.put(i, 0);    // 도달한 총 사용자 수 초기화
        }

        // stages 배열을 순회하면서 실패자 수와 도달한 사용자 수를 계산
        for (int stage : stages) {
            for (int i = 1; i <= stage; i++) {
                totalCount.put(i, totalCount.getOrDefault(i, 0) + 1);  // 각 스테이지에 도달한 사용자 수 증가
            }
            if (stage <= N) {
                failureCount.put(stage, failureCount.getOrDefault(stage, 0) + 1);  // 실패자 수 증가
            }
        }

        // 실패율을 계산하고 리스트에 저장
        List<Map.Entry<Integer, Double>> failureRates = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int failure = failureCount.get(i);
            int total = totalCount.get(i);
            double rate = total == 0 ? 0 : (double) failure / total;  // 도달한 사람이 없으면 실패율은 0
            failureRates.add(new AbstractMap.SimpleEntry<>(i, rate));  // (스테이지 번호, 실패율) 쌍으로 저장
        }

        // 실패율 내림차순, 실패율이 같으면 스테이지 번호 오름차순 정렬
        failureRates.sort(Map.Entry.<Integer, Double>comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.comparingByKey()));

        // 결과 배열에 스테이지 번호만 넣어서 반환
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failureRates.get(i).getKey();  // 정렬된 순서대로 스테이지 번호를 배열에 저장
        }

        return answer;
    }
}
